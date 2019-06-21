package pl.lodz.uni.math.BankApplication.Transfer;


import org.joda.money.Money;
import pl.lodz.uni.math.BankApplication.Account.AccountService;

class InternationalTransfer extends Transfer {

    AccountService toAccount = new AccountService();

    /**
    @Override
    public Money doTransfer(String typeOfTransfer) throws Exception {
        switch (typeOfTransfer) {
            case "credit":
                toAccount.callBankOperations("-", Money.parse("USD 2.0"));
                return toAccount.showAccountBalance();
            default:
                throw new Exception("invalid type of transfer");
        }
    }
    */
}

