package org.example.util;

public class TransactionIdGenerator {

    public static String generateTransactionId() {

        return "TXN" + System.currentTimeMillis();
    }
}