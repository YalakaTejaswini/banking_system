package org.example.util;

import org.example.model.Transaction;

public class ReceiptPrinter {

    public static void printReceipt(Transaction transaction) {

        System.out.println();

        System.out.println("==========================================");
        System.out.println("         TRANSACTION RECEIPT");
        System.out.println("==========================================");

        System.out.println("Transaction ID : " + transaction.getTransactionId());
        System.out.println("UTR ID         : " + transaction.getUtrId());
        System.out.println("From Account   : " + transaction.getFromAccount());
        System.out.println("To Account     : " + transaction.getToAccount());
        System.out.println("Amount         : ₹" + transaction.getAmount());
        System.out.println("Date & Time    : " + transaction.getDateTime());
        System.out.println("Status         : " + transaction.getStatus());

        System.out.println("==========================================");
    }

}