package org.xpdojo.bank;

public class account {

    int balance = 0;

    public int getbalance(){
                return balance;
    }

    public void deposit(int amt) {
        balance = balance + amt;
    }
    public int getBalanceAfterDeposit() {
        return balance;
    }

    public void withdraw(int withdraw_amt) {
        balance = balance - withdraw_amt;
    }

    public void transferAmt(account b, int i) {
        b.deposit(i);
    }
}
