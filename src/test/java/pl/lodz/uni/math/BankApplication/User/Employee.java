package pl.lodz.uni.math.BankApplication.User;

import pl.lodz.uni.math.BankApplication.Account.AccountService;

import java.util.ArrayList;

class Employee extends User {

    protected AccountService ClientAccountService = new AccountService();
    protected UserService ClientService = new UserService();

    public ArrayList<Client> viewDataOfClients() throws Exception {
        ClientService.createNewUser("client");
        ClientService.addNewClientToTheListOfClients();
        return ClientService.getClients();
    }

}