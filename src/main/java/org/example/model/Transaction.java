package org.example.model;

public class Transaction {

    private String transactionId;
    private String utrId;
    private long fromAccount;
    private long toAccount;
    private double amount;
    private String dateTime;
    private String status;


    public Transaction(String transactionId,
                       String utrId,
                       long fromAccount,
                       long toAccount,
                       double amount,
                       String dateTime,
                       String status) {

        this.transactionId = transactionId;
        this.utrId = utrId;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.dateTime = dateTime;
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getUtrId() {
        return utrId;
    }

    public long getFromAccount() {
        return fromAccount;
    }

    public long getToAccount() {
        return toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getStatus() {
        return status;
    }
}