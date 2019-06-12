package pl.lodz.uni.math.BankApplication.Account;

import nl.garvelink.iban.IBAN;
import org.iban4j.Iban;
import org.joda.money.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class InternationalAccountTest {
    private final InternationalAccount internationalAccountTester = new InternationalAccount();

    @Test
    void checkIfAccountNumberIsGenerated() {
        InternationalAccount accountTester = mock(InternationalAccount.class);
        String stringDateToBeDisplayed = "NL91ABNA0417164300";
        when(accountTester.getAccountNumber()).thenReturn(stringDateToBeDisplayed);
    }

    @Test
    void checkIfInitialAccountBalanceSetToZero() throws Exception {
        assertEquals(Money.parse("USD 10.0"), internationalAccountTester.checkAccountBalance());
    }

    @Test
    void checkIfAccountPerformsAddOperation() throws Exception {
        internationalAccountTester.performAnOperation("+", Money.parse("USD 23.87"));
        assertEquals(Money.parse("USD 33.87"), internationalAccountTester.checkAccountBalance());
    }

    @Test
    void checkIfAccountPerforsmSubstractOperation() throws Exception {
        internationalAccountTester.performAnOperation("+", Money.parse("USD 10.0"));
        internationalAccountTester.performAnOperation("-", Money.parse("USD 5.0"));
        assertEquals(Money.parse("USD 15.00"), internationalAccountTester.checkAccountBalance());
    }

    @Test
    void checkIfAccountThrowsExceptionIfUnkownOperation() throws Exception {
        internationalAccountTester.performAnOperation("+", Money.parse("USD 10.00"));
        assertThrows(Exception.class, () -> internationalAccountTester.performAnOperation(".", Money.parse("USD 10.00")));
    }
}