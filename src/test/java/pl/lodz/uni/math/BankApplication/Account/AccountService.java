package pl.lodz.uni.math.BankApplication.Account;



import java.util.*;

public class AccountService {
    protected Account accountToBeCreated;
    protected ArrayList<Account> pending = new ArrayList<Account>();
    protected ArrayList<Account> approved = new ArrayList<>();


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
            default:
                throw new Exception("Unknown type of account");
        }
    }
    public Account getAccountToBeCreated() {
        return accountToBeCreated;
    }
    protected void sendAccountForApproval(){
        pending.add(this.accountToBeCreated);
    }
    public ArrayList getAccountsForApproval(){
        return pending;
    }
    public void approveAccount() {
        for (int i = 0; i < pending.size(); i++){
            if (pending.get(i).accepted == false){
                pending.get(i).setAccepted(true);
            }
        }
    }
    public void removeAccount(){
        for (int i = 0; i < pending.size(); i++){
            if (pending.get(i).accepted == true){
                addApprovedAccountToApprovedAccounts(pending.get(i));
                pending.remove(i);
            }
        }
    }
    public ArrayList getApprovedAccounts(){
        return approved;
    }
    public void addApprovedAccountToApprovedAccounts(Account accountToBeAdded){
        approved.add(accountToBeAdded);
    }
    public String getAccountNumber(){
        return accountToBeCreated.getAccountNumber();
    }
    public boolean getApproved(){
        return accountToBeCreated.accepted;
    }
}