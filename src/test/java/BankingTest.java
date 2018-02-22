import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankingTest {

    private Account account;

    @Before
    public void setUp() throws Exception {
        account = Account.openDebitAccount();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void GIVEN_a_debit_account_WHEN_deposit_100_THEN_balance_is_100() {
        //given
        //when
        account.deposit(99L);
        //then
        assertEquals(99L, account.getBalance());

    }

    @Test
    public void GIVEN_某借记卡里面有99元_WHEN_取出50元_THEN_余额还剩49() {
        //given
        Account account = Account.openDebitAccount();
        account.deposit(99L);
        //when
        account.withdraw(50L);
        //then
        assertEquals(49L, account.getBalance());
    }

}
