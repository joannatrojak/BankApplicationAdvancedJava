package pl.lodz.uni.math.BankApplication.User;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private final Employee userTester = new Employee();
    private final Client userTester2 = new Client();
    private final UserService userService = new UserService();

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
    void checkIfThereArePendingAccounts() throws Exception {
        userTester2.requestAccount("regular");
    }
    @Test
    void viewDataOfClients() throws Exception {
        userService.createNewUser("client");
        userService.addNewClientToTheListOfClients();
        assertEquals(1, userService.listOfClients.size());
        assertEquals(null, userTester.viewDataOfClients().get(0).getUserLogin());
    }
}