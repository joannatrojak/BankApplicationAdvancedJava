package pl.lodz.uni.math.BankApplication.Account;

import nl.garvelink.iban.IBAN;
import org.joda.money.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SavingAccountTest {
    private final SavingAccount accountTester = new SavingAccount();

    @Test
    void checkIfAccountNumberIsGenerated() {
        SavingAccount accountTester = mock(SavingAccount.class);
        String stringDateToBeDisplayed = "91ABNA0417164300";
        when(accountTester.getAccountNumberWithoutIBAN()).thenReturn(stringDateToBeDisplayed);
    }

    @Test
    void checkIfInitialAccountBalanceSetToZero() throws Exception {
        assertEquals(Money.parse("USD 10.0"), accountTester.checkAccountBalance());
    }

    @Test
    void checkIfAccountPerformsAddOperation() throws Exception {
        accountTester.performAnOperation("+", Money.parse("USD 23.87"));
        assertEquals(Money.parse("USD 33.87"), accountTester.checkAccountBalance());
    }

    @Test
    void checkIfAccountPerforsmSubstractOperation() throws Exception {
        accountTester.performAnOperation("+", Money.parse("USD 10.0"));
        accountTester.performAnOperation("-", Money.parse("USD 5.0"));
        assertEquals(Money.parse("USD 15.00"), accountTester.checkAccountBalance());
    }

    @Test
    void checkIfAccountThrowsExceptionIfUnkownOperation() throws Exception {
        accountTester.performAnOperation("+", Money.parse("USD 10.00"));
        assertThrows(Exception.class, () -> accountTester.performAnOperation(".", Money.parse("USD 10.00")));
    }
    @Test
    void checkIfHowManyMinutesReturnsTheDifferenceBetweenTwoDates(){
        SavingAccount accountTester = mock(SavingAccount.class);
        Long timeToBeMocked = Long.valueOf(38);
        when(accountTester.howManyMinutes()).thenReturn(timeToBeMocked);
    }
    @Test
    void checkIfInterestRateIsReturned(){
        SavingAccount accountTester = mock(SavingAccount.class);
        Money interestToBeMocked = Money.parse("USD 0.44");
        when(accountTester.whatIsTheInterest()).thenReturn(interestToBeMocked);
    }
    @Test
    void checkIfAccountIsUpdated() throws Exception {
        Money beforeInterest = accountTester.accountBalance;
        accountTester.updateAccount();
        Money afterInterest = accountTester.accountBalance;
        assertTrue(afterInterest.isGreaterThan(beforeInterest));
    }
}