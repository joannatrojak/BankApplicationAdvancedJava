package pl.lodz.uni.math.BankApplication.Account;


class RegularAccount extends Account {

    private String accountNumberWithoutIBAN = accountNumber.substring(2);


    public String getAccountNumberWithoutIBAN() {
        return accountNumberWithoutIBAN;
    }
}
