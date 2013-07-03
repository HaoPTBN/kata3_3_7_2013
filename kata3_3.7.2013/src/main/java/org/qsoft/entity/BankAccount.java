package org.qsoft.entity;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 7/3/13
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
