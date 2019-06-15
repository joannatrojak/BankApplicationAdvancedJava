package pl.lodz.uni.math.BankApplication.Transfer;

import org.joda.money.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class InternationalTransferTest {

    private final InternationalTransfer tranferTester = new InternationalTransfer();

    @Test
    void checkAmmountToBeTranfered() {
        tranferTester.setAmountToBeTransfered(Money.parse("USD 10.00"));
        assertEquals(Money.parse("USD 10.00"), tranferTester.getAmountToBeTransfered());
    }

    @Test
    void checkDateOfTranfer() {
        Transfer transfterTester = mock(Transfer.class);
        String stringDateToBeDisplayed = "03-06-19";
        when(transfterTester.getTransferDate()).thenReturn(stringDateToBeDisplayed);

    }

    @Test
    void checkNumberOfTransaction() {
        tranferTester.setNumberOfTransaction("01");
        assertEquals("01", tranferTester.getNumberOfTransaction());
    }
    //@Test
    /*
    void performCreditOperation() throws Exception {
        assertEquals(Money.parse("USD 8.0"), tranferTester.doTransfer("credit"));
    }
    */
}