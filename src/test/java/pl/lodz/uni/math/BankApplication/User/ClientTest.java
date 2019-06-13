package pl.lodz.uni.math.BankApplication.User;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    void requestNewAccount(){
        assertEquals("Account created", userTester.requestNewAccount());
    }
}