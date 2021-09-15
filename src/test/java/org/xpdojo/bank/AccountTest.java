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
    public void canIDepositAmount()
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
    public void canIWithdrawAmount()
    {
        account a = new account();
        int withdraw_amt = 200;
        int balance_before = 0;
        int balance_after = 0;
        balance_before = a.getbalance();
        a.withdraw(withdraw_amt);
        balance_after = a.getbalance();

        assertThat(balance_after).isGreaterThanOrEqualTo(0);
    }

    @Test
    public void canITransferAmount()
    {
        account a = new account();
        account b = new account();
        int deposit_amt = 200;
        int transfer_amt = 200;
        a.deposit(200);
        b.deposit(200);
        int balance_before = 0;
        balance_before = b.getbalance();
        a.transferAmt(b,transfer_amt);
        int balance_after = 0;
        balance_after = b.getbalance();
        assertThat(balance_after).isEqualTo(balance_before+transfer_amt);
    }

    @Test
    @Disabled
    public void isAccountActive()
    {

    }
}
