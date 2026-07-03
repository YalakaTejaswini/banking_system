package org.example.repository;

import org.example.model.Account;
import org.example.model.Transaction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankRepository {

    // Stores all accounts
    private final Map<Long, Account> accounts = new HashMap<>();

    // Stores all transactions
    private final List<Transaction> transactions = new ArrayList<>();


    // ==============================
    // Account Methods
    // ==============================

    public void saveAccount(Account account) {

        accounts.put(account.getAccountNumber(), account);

    }

    public Account findAccount(long accountNumber) {

        return accounts.get(accountNumber);

    }

    public boolean accountExists(long accountNumber) {

        return accounts.containsKey(accountNumber);

    }

    public Collection<Account> getAllAccounts() {

        return accounts.values();

    }


    // ==============================
    // Transaction Methods
    // ==============================

    public void saveTransaction(Transaction transaction) {

        transactions.add(transaction);

    }

    public List<Transaction> getAllTransactions() {

        return transactions;

    }

}