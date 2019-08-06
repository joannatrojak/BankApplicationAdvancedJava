package pl.lodz.uni.math.BankApplication.Account;

import org.iban4j.Iban;
import org.joda.money.Money;

import java.util.ArrayList;

abstract class Account extends ArrayList {
    String accountNumber = String.valueOf(Iban.random());
    Money accountBalance = Money.parse("USD 10");

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    boolean accepted = false;


    public String getAccountNumber() {
        return this.accountNumber;
    }

    private void addMoneyToTheAccount(Money amountToAdd) {
        this.accountBalance = accountBalance.plus(amountToAdd);
    }
    public Money checkAccountBalance() throws Exception {
        if (accountBalance.isNegative()){
            throw new Exception("Account balance exceeded");
        }
        return accountBalance;
    }
    private void substractMoneyFromTheAccount(Money amountToSubstract) {
        this.accountBalance = accountBalance.minus(amountToSubstract);
    }
    public void performAnOperation(String operation, Money amountToPass) throws Exception {
        switch (operation){
            case "+":
                addMoneyToTheAccount(Money.parse(String.valueOf(amountToPass)));
                return;
            case "-":
                substractMoneyFromTheAccount(Money.parse(String.valueOf(amountToPass)));
                return;
            default:
                throw new Exception("Unknown operation");
        }
    }
}
