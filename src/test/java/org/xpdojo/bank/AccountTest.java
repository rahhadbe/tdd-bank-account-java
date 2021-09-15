package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void isAccountBalanceGreaterThanZero()
    {
        account a = new account();
        int balance = 0;
        balance = a.getbalance();

        assertThat(balance).isGreaterThan(0);
    }

    @Test
    public void isAccountBalanceGreaterThanBeforeDeposit()
    {
        account a = new account();
        int deposit_amt = 100;
        int balance_before = 0;
        int balance_after = 0;
        balance_before = a.getbalance();
        a.deposit(deposit_amt);
        balance_after = a.getbalance();

        assertThat(balance_after).isGreaterThan(balance_before);
    }

    @Test
    @Disabled
    public void isAccountActive()
    {

    }
}
