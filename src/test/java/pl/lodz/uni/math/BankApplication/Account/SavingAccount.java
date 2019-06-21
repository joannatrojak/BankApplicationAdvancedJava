package pl.lodz.uni.math.BankApplication.Account;

import org.joda.money.Money;
import org.joda.time.Interval;

class SavingAccount extends Account implements InterestGenerator {

    private String accountNumberWithoutIBAN = accountNumber.substring(2);


    public String getAccountNumberWithoutIBAN() {
        return accountNumberWithoutIBAN;
    }

    @Override
    public long howManyMinutes() {
        return new Interval(startDate, endDate).toDurationMillis();
    }

    @Override
    public Money whatIsTheInterest() {
        return interestRate.multipliedBy(howManyMinutes());
    }

    @Override
    public void updateAccount() {
        this.accountBalance = this.accountBalance.plus(whatIsTheInterest());
    }
}
