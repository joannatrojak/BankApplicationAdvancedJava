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
    void checkAfterApproval() throws Exception {
        accountTester.createNewAccount("regular");
        accountTester.sendAccountForApproval();
        accountTester.approveAccount();
    }
    @Test
    void checkIfAccountNumberIsShownForTheAccount() throws Exception {
        AccountService accountTester = mock(AccountService.class);
        String stringDateToBeDisplayed = "NL91ABNA0417164300";
        when(accountTester.getAccountNumber()).thenReturn(stringDateToBeDisplayed);
    }
    @Test
    void checkIfAccountsWaitingForApprovalAreNotEmpty() throws Exception {
        accountTester.createNewAccount("regular");
        accountTester.sendAccountForApproval();
        assertNotNull(accountTester.getAccountsForApproval());
        assertFalse(accountTester.getAccountToBeCreated().accepted);
    }
    @Test
    void checkIfAccountHasBeenApproved() throws Exception {
        accountTester.createNewAccount("international");
        accountTester.sendAccountForApproval();
        accountTester.approveAccount();
        assertTrue(accountTester.getAccountToBeCreated().accepted);
    }
    @Test
    void checkIfAccountHasBeenRemovedAfterApproval() throws Exception {
        accountTester.createNewAccount("international");
        accountTester.sendAccountForApproval();
        accountTester.approveAccount();
        accountTester.removeAccount();
        assertEquals(0, accountTester.pending.size());
    }
    @Test
    void checkIfAccountWasAddedToApproved() throws Exception {
        accountTester.createNewAccount("regular");
        accountTester.sendAccountForApproval();
        accountTester.approveAccount();
        accountTester.removeAccount();
        assertNotNull(accountTester.getApprovedAccounts());
        assertTrue(accountTester.getAccountToBeCreated().accepted);
    }
}