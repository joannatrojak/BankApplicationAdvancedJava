package pl.lodz.uni.math.BankApplication.User;


import pl.lodz.uni.math.BankApplication.Account.AccountService;

class Client extends User {

    protected AccountService ClientAccountService = new AccountService();

    public void requestAccount(String typeOfAccount) throws Exception {
        this.ClientAccountService.createNewAccount(typeOfAccount);
    }

    public String getAccountNumber() {
        return ClientAccountService.getAccountNumber();
    }

    public boolean makeTransaction() {
        if (ClientAccountService.getApproved()){
            return true;
        }
        return false;
    }
}
