package org.example.service;

import org.example.exception.InsufficientBalanceException;
import org.example.exception.InvalidAccountException;
import org.example.model.Account;
import org.example.model.Transaction;
import org.example.repository.BankRepository;
import org.example.util.ReceiptPrinter;
import org.example.util.TransactionIdGenerator;
import org.example.util.UTRGenerator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransferService {

    private final BankRepository repository;

    public TransferService(BankRepository repository) {
        this.repository = repository;
    }

    public void transfer(long fromAccount,
                         long toAccount,
                         double amount) {

        Account sender = repository.findAccount(fromAccount);
        Account receiver = repository.findAccount(toAccount);

        if (sender == null) {
            throw new InvalidAccountException("Sender Account Not Found!");
        }

        if (receiver == null) {
            throw new InvalidAccountException("Receiver Account Not Found!");
        }

        if (sender.getBalance() < amount) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }

        sender.withdraw(amount);
        receiver.deposit(amount);

        String transactionId = TransactionIdGenerator.generateTransactionId();

        String utr = UTRGenerator.generateUTR();

        String dateTime = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a"));

        Transaction transaction = new Transaction(
                transactionId,
                utr,
                fromAccount,
                toAccount,
                amount,
                dateTime,
                "SUCCESS"
        );

        repository.saveTransaction(transaction);

        System.out.println();
        System.out.println("===== Transfer Successful =====");

        ReceiptPrinter.printReceipt(transaction);
    }

    public void showTransactionHistory() {

        System.out.println();

        System.out.println("===== Transaction History =====");

        if (repository.getAllTransactions().isEmpty()) {

            System.out.println("No Transactions Found.");

            return;
        }

        for (Transaction transaction : repository.getAllTransactions()) {

            ReceiptPrinter.printReceipt(transaction);

        }

    }
}