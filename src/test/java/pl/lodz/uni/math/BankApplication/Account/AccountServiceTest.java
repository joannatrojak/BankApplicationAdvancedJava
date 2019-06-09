package pl.lodz.uni.math.BankApplication.Account;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTest {
    private final AccountService accountTester = new AccountService();

    @Test
    void createAccountRegular() throws Exception {
        assertThat(accountTester.getAccountToBeCreated("regular"), instanceOf(RegularAccount.class));
    }

    @Test
    void createAccountSaving() throws Exception {
        assertThat(accountTester.getAccountToBeCreated("saving"), instanceOf(SavingAccount.class));
    }

    @Test
    void createAccountInternational() throws Exception {
        assertThat(accountTester.getAccountToBeCreated("international"), instanceOf(InternationalAccount.class));
    }
}