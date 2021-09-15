package org.xpdojo.bank;

public class account {

    int balance = -1;

    public int getbalance() {
        return balance;
    }

    public void deposit(int amt) {
        balance = balance + amt;
    }
    public int getBalanceAfterDeposit() {
        return balance;
    }

}
