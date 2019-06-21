package pl.lodz.uni.math.BankApplication.Account;


import java.util.ArrayList;

public class AccountService {
    protected Account accountToBeCreated;
    protected ArrayList<Account> pending = new ArrayList<Account>();



    public void createNewAccount(String typeOfAccount) throws Exception {
        switch (typeOfAccount){
            case "regular":
                this.accountToBeCreated = new RegularAccount();
                break;
            case "saving":
                this.accountToBeCreated = new SavingAccount();
                break;
            case "international":
                this.accountToBeCreated = new InternationalAccount();
                break;
        }
    }
    public Account getAccountToBeCreated() {
        return accountToBeCreated;
    }
    protected void sendAccountForApproval(){
        pending.add(this.accountToBeCreated);
    }
    protected ArrayList getAccountsForApproval(){
        return pending;
    }
    public void approveAccount() {
        for (Account account : pending){
            if (account.accepted == false){
                account.accepted = true;
            }
        }
    }
    public boolean ifApproved(){
        return pending.get(0).accepted;
    }
    public String getAccountNumber(){
        return accountToBeCreated.getAccountNumber();
    }
}
