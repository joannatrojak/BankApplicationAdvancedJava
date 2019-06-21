package pl.lodz.uni.math.BankApplication.Transfer;

import org.joda.money.Money;
import pl.lodz.uni.math.BankApplication.Account.AccountService;

public class RegularTransfer extends Transfer {

    AccountService fromAccount = new AccountService();
    AccountService toAccount = new AccountService();
    //@Override
    /*
    public Money doTransfer(String typeOfTransfer) throws Exception {
        switch (typeOfTransfer) {
            case "debit":
                fromAccount.callBankOperations("+", Money.parse("USD 5.0"));
                return fromAccount.showAccountBalance();
            case "credit":
                fromAccount.callBankOperations("-", Money.parse("USD 2.0"));
                return fromAccount.showAccountBalance();
            default:
                throw new Exception("invalid type of transfer");
        }
    }

    public String getFromAccount() {
        return fromAccount.showAccountNumber();
    }
    public String getToAccount(){
        return toAccount.showAccountNumber();
    }

    public boolean differentAccounts() {
        if (this.fromAccount != this.toAccount){
            return true;
        }
        return false;
    }
    */
}
