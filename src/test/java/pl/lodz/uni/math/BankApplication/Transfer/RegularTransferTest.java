package pl.lodz.uni.math.BankApplication.Transfer;

import org.joda.money.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularTransferTest {
    private final RegularTransfer regulartranferTester = new RegularTransfer();
    /**
    @Test
    void checkIfAccountsAreDifferent() {
        assertTrue(regulartranferTester.differentAccounts());
    }
    @Test
    void performDebitOperation() throws Exception {
        assertEquals(Money.parse("USD 15.0"), regulartranferTester.doTransfer("debit"));
    }
    @Test
    void performCreditOperation() throws Exception {
        assertEquals(Money.parse("USD 8.0"), regulartranferTester.doTransfer("credit"));
    }
    */
}