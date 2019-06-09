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
    void checkIfTypeIsFromTheList() {
        assertTrue(userTester.checkUserTypeOnTheList("client"));
        assertTrue(userTester.checkUserTypeOnTheList("employee"));
        assertTrue(userTester.checkUserTypeOnTheList("director"));
        assertFalse(userTester.checkUserTypeOnTheList("blabla"));
    }

    @Test
    void checkIfUserTypeIsClient() {
        userTester.setUserType("client");
        assertEquals("client", userTester.getUserType());
    }

    @Test
    void checkIfTypeIsEmployee() {
        userTester.setUserType("employee");
        assertEquals("employee", userTester.getUserType());
    }

    @Test
    void checkIfTypeIsDirector() {
        userTester.setUserType("director");
        assertEquals("director", userTester.getUserType());
    }

    @Test
    void checkIfTypeIsSetToNullIfNotFromTheList() {
        userTester.setUserType("user");
        assertNull(userTester.getUserType());
    }
}