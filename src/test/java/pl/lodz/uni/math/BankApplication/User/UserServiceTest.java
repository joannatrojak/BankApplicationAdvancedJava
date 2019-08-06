package pl.lodz.uni.math.BankApplication.User;

import org.junit.jupiter.api.Test;


import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private final UserService userTester = new UserService();

    @Test
    void checkIfClientWasCreated() throws Exception {
        userTester.createNewUser("client");
        assertThat(userTester.getUserToBeCreated(), instanceOf(Client.class));
    }
    @Test
    void checkIfEmployeeWasCreated() throws Exception{
        userTester.createNewUser("employee");
        assertThat(userTester.getUserToBeCreated(), instanceOf(Employee.class));
    }
    @Test
    void checkIfDirectorWasCreated() throws Exception{
        userTester.createNewUser("director");
        assertThat(userTester.getUserToBeCreated(), instanceOf(Director.class));
    }
    @Test
    void checkIfListOfClientsIsNotEmpty() throws Exception {
        userTester.createNewUser("client");
        userTester.addNewClientToTheListOfClients();
        assertEquals(1, userTester.listOfClients.size());
    }
}