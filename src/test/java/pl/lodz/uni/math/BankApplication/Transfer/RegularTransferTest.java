package pl.lodz.uni.math.BankApplication.Transfer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularTransferTest {
    private final RegularTransfer regulartranferTester = new RegularTransfer();

    @Test
    void checkIfTranferGetsAnAccountNumber() {
        assertEquals("91ABNA0417164300", regulartranferTester.getFromAccount());
    }
}