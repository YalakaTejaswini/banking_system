package org.example.service;

import org.example.exception.DuplicateAccountException;
import org.example.exception.InsufficientBalanceException;
import org.example.exception.InvalidAccountException;
import org.example.model.Account;
import org.example.model.Customer;
import org.example.repository.BankRepository;
import org.example.util.Validation;

public class BankService {

    private final BankRepository repository;

    public BankService(BankRepository repository) {
        this.repository = repository;
    }

    // ==========================
    // Create Account
    // ==========================
    public void createAccount(long accountNumber,
                              String accountHolderName,
                              double initialBalance) {

        if (repository.accountExists(accountNumber)) {
            throw new DuplicateAccountException("Account Number Already Exists!");
        }

        if (!Validation.isValidAmount(initialBalance)) {
            System.out.println("Initial Balance must be greater than zero.");
            return;
        }

        Customer customer = new Customer(accountHolderName);

        Account account = new Account(accountNumber, customer, initialBalance);

        repository.saveAccount(account);

        System.out.println("✅ Account Created Successfully.");
    }

    // ==========================
    // Deposit
    // ==========================
    public void deposit(long accountNumber, double amount) {

        if (!Validation.isValidAmount(amount)) {
            System.out.println("Invalid Deposit Amount.");
            return;
        }

        Account account = repository.findAccount(accountNumber);

        if (account == null) {
            throw new InvalidAccountException("Invalid Account Number!");
        }

        account.deposit(amount);

        System.out.println("₹" + amount + " Deposited Successfully.");
    }

    // ==========================
    // Withdraw
    // ==========================
    public void withdraw(long accountNumber, double amount) {

        if (!Validation.isValidAmount(amount)) {
            System.out.println("Invalid Withdraw Amount.");
            return;
        }

        Account account = repository.findAccount(accountNumber);

        if (account == null) {
            throw new InvalidAccountException("Invalid Account Number!");
        }

        if (account.getBalance() < amount) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }

        account.withdraw(amount);

        System.out.println("₹" + amount + " Withdrawn Successfully.");
    }

    // ==========================
    // Check Balance
    // ==========================
    public void checkBalance(long accountNumber) {

        Account account = repository.findAccount(accountNumber);

        if (account == null) {
            throw new InvalidAccountException("Invalid Account Number!");
        }

        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Account Holder : " + account.getCustomer().getCustomerName());
        System.out.println("Current Balance: ₹" + account.getBalance());
    }

    // ==========================
    // View All Accounts
    // ==========================
    public void viewAllAccounts() {

        System.out.println("\n===== All Accounts =====");

        if (repository.getAllAccounts().isEmpty()) {
            System.out.println("No Accounts Found.");
            return;
        }

        for (Account account : repository.getAllAccounts()) {
            System.out.println(account);
        }
    }

}