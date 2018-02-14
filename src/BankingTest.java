import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 练习二：
 * 编写更多测试用例，注意独立性，每个函数只测一件事情。
 * 学会用try-catch方式捕获Exception，不要忘记fail()。
 * 用TDD方式修改Bug。另外再试一下在@Test注解中捕获异常。
 * 用IDE的重构命令来提取自定义断言。
 */

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
