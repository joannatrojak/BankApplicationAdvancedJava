package pl.lodz.uni.math.BankApplication.Account;

import org.joda.money.Money;
import org.joda.time.DateTime;

interface InterestGenerator {
    DateTime startDate = new DateTime();
    DateTime endDate = new DateTime();
    Money interestRate = Money.parse("USD 0.01");


    long howManyMinutes();
    Money whatIsTheInterest();
    void updateAccount();
}
