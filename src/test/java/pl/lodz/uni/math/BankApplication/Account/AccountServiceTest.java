package pl.lodz.uni.math.BankApplication.Account;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AccountServiceTest {
    private final AccountService accountTester = new AccountService();


    @Test
    void checkIfRegularAccountWasCreated() throws Exception {
        accountTester.createNewAccount("regular");
        assertThat(accountTester.getAccountToBeCreated(), instanceOf(RegularAccount.class));
    }
    @Test
    void checkIfSavingAccountWasCreated() throws Exception {
        accountTester.createNewAccount("saving");
        assertThat(accountTester.getAccountToBeCreated(), instanceOf(SavingAccount.class));
    }
    @Test
    void checkIfInternationalAccountWasCreated() throws Exception {
        accountTester.createNewAccount("international");
        assertThat(accountTester.getAccountToBeCreated(), instanceOf(InternationalAccount.class));
    }
    @Test
    void checkIfAccountIsApproved(){
        assertFalse(accountTester.ifApproved());
    }
    @Test
    void checkAfterApproval(){
        accountTester.approveAccount();
        assertTrue(accountTester.ifApproved());
    }
    @Test
    void checkIfAccountNumberIsShownForTheAccount() throws Exception {
        AccountService accountTester = mock(AccountService.class);
        String stringDateToBeDisplayed = "NL91ABNA0417164300";
        when(accountTester.getAccountNumber()).thenReturn(stringDateToBeDisplayed);
    }
}