package pl.lodz.uni.math.BankApplication.User;

import org.junit.jupiter.api.Test;
import pl.lodz.uni.math.BankApplication.Account.AccountService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ClientTest {
    private final Client userTester = new Client();

    @Test
    void checkIfLoginIsCorrect() {
        userTester.setUserLogin("login1");
        assertEquals("login1", userTester.getUserLogin());
        assertNotEquals("", userTester.getUserLogin());
        assertNotEquals("login", userTester.getUserLogin());
    }

    @Test
    void checkIfLoginEmptyIsSetToNull() {
        userTester.setUserLogin("");
        assertNull(userTester.getUserLogin());
    }

    @Test
    void checkIfLoginLessThanSixIsSetToNull() {
        userTester.setUserLogin("login");
        assertNull(userTester.getUserLogin());
    }

    @Test
    void checkIfPasswordIsSetCorrectly() {
        userTester.setUserPassword("password");
        assertEquals("password", userTester.getUserPassword());
    }

    @Test
    void checkIfPasswordEmptyIsSetToNull() {
        userTester.setUserPassword("");
        assertNull(userTester.getUserPassword());
    }

    @Test
    void checkIfPaswwordLessThanSixletters() {
        userTester.setUserPassword("pass");
        assertNull(userTester.getUserPassword());
    }
    @Test
    void checkIfAccountNumberIsShownForTheAccount() throws Exception {
        Client accountTester = mock(Client.class);
        String stringDateToBeDisplayed = "NL91ABNA0417164300";
        when(accountTester.getAccountNumber()).thenReturn(stringDateToBeDisplayed);
    }
    /*
    @Test
    void checkIfUserCanMakeTransactions() throws Exception {
        assertEquals("regular", userTester.ClientAccountService.getAccountToBeCreated());
    }
    */
}