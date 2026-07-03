package org.example.model;

public class Account {

    private long accountNumber;
    private Customer customer;
    private double balance;

    public Account(long accountNumber, Customer customer, double balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;

    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {

        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + customer.getCustomerName() + '\'' +
                ", balance=" + balance +
                '}';
    }
}