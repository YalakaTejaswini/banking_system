# 🏦 Bank Management System (Java Console Application)

A **Java Console-Based Bank Management System** developed using **Core Java** and a **3-Layer Architecture (Model → Repository → Service)**. This project demonstrates Object-Oriented Programming (OOP), Collections Framework, Exception Handling, and clean code practices.

---

## 📌 Features

* ✅ Create Bank Account
* 💰 Deposit Money
* 💸 Withdraw Money
* 🔍 Check Account Balance
* 🔄 Transfer Money Between Accounts
* 📄 View All Accounts
* 🧾 View Transaction History
* 🆔 Auto-Generated Transaction ID
* 🏦 Auto-Generated UTR Number
* ⚠️ Custom Exception Handling
* 🖥️ Menu-Driven Console Application

---

## 🛠️ Technologies Used

* Java 17+
* Object-Oriented Programming (OOP)
* Collections Framework (`HashMap`, `ArrayList`)
* Exception Handling
* Java Time API
* Layered Architecture

---

## 📂 Project Structure

```text
src
└── main
    └── java
        └── org.example
            ├── model
            │      Account.java
            │      Customer.java
            │      Transaction.java
            │
            ├── repository
            │      BankRepository.java
            │
            ├── service
            │      BankService.java
            │      TransferService.java
            │
            ├── exception
            │      DuplicateAccountException.java
            │      InvalidAccountException.java
            │      InsufficientBalanceException.java
            │
            ├── util
            │      Validation.java
            │      UTRGenerator.java
            │      TransactionIdGenerator.java
            │      ReceiptPrinter.java
            │
            └── Main.java
```

---

## 🚀 Application Workflow

```text
User
   │
   ▼
Main.java
   │
   ▼
Service Layer
   │
   ▼
Repository Layer
   │
   ▼
In-Memory Storage (HashMap & ArrayList)
```

---

## 💡 Functionalities

### 1. Create Account

* Creates a new bank account.
* Prevents duplicate account numbers.
* Stores account details in memory.

### 2. Deposit Money

* Deposits money into an existing account.
* Validates the entered amount.

### 3. Withdraw Money

* Withdraws money from an account.
* Prevents withdrawal if the balance is insufficient.

### 4. Check Balance

* Displays account holder details.
* Shows the current account balance.

### 5. Transfer Money

* Transfers money between two accounts.
* Generates:

  * Transaction ID
  * UTR Number
* Stores transaction history.
* Prints a formatted transaction receipt.

### 6. View All Accounts

Displays all accounts currently stored in the system.

### 7. View Transaction History

Displays all successful transactions with complete receipt details.

---

## 🖥️ Sample Console Output

========== BANK TRANSFER SYSTEM ==========
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Transfer Money
6. View All Accounts
7. View Transaction History
8. Exit

Enter your choice : 1
Enter Account Number : 12345
Enter Account Holder Name : teja
Enter Initial Balance : 10000
✅ Account Created Successfully.

========== BANK TRANSFER SYSTEM ==========
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Transfer Money
6. View All Accounts
7. View Transaction History
8. Exit

Enter your choice : 1
Enter Account Number : 67890
Enter Account Holder Name : nikhii
Enter Initial Balance : 20000
✅ Account Created Successfully.

========== BANK TRANSFER SYSTEM ==========
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Transfer Money
6. View All Accounts
7. View Transaction History
8. Exit

Enter your choice : 5
From Account : 12345
To Account : 67890
Amount : 5000

===== Transfer Successful =====

==========================================
         TRANSACTION RECEIPT
==========================================
Transaction ID : TXN1783077927659
UTR ID         : SBI20260703000001
From Account   : 12345
To Account     : 67890
Amount         : ₹5000.0
Date & Time    : 03-07-2026 04:55:27 pm
Status         : SUCCESS
==========================================

========== BANK TRANSFER SYSTEM ==========
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Transfer Money
6. View All Accounts
7. View Transaction History
8. Exit

Enter your choice : ........

```text
========== BANK TRANSFER SYSTEM ==========
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Transfer Money
6. View All Accounts
7. View Transaction History
8. Exit

Enter your choice : 5

From Account : 12345678
To Account   : 456789
Amount       : 1000

===== Transfer Successful =====

==========================================
         TRANSACTION RECEIPT
==========================================
Transaction ID : TXN1783057124095
UTR ID         : SBI20260703000001
From Account   : 12345678
To Account     : 456789
Amount         : ₹1000.0
Date & Time    : 03-07-2026 11:08:44 AM
Status         : SUCCESS
==========================================
```

---

## 🏗️ OOP Concepts Used

* Encapsulation
* Abstraction
* Composition
* Constructor Injection
* Layered Architecture

---

## 📚 Java Concepts Covered

* Classes and Objects
* Constructors
* Packages
* Collections Framework
* HashMap
* ArrayList
* Exception Handling
* Custom Exceptions
* Loops
* Scanner Class
* Java Time API
* UUID/Unique ID Generation
* Method Calling
* Clean Code Principles

---

## 🎯 Learning Outcomes

This project helped in understanding:

* Designing a layered Java application
* Applying OOP principles in a real-world scenario
* Managing in-memory data using collections
* Creating reusable utility classes
* Handling exceptions effectively
* Building a menu-driven console application

---

## 🚀 Future Enhancements

* JDBC with MySQL integration
* Spring Boot REST APIs
* User authentication
* Account types (Savings/Current)
* Interest calculation
* Mini Statement
* Delete Account
* Update Account Details
* File-based persistence
* React or Angular frontend

---

## 👨‍💻 Author

**Tejaswini **

If you found this project helpful, feel free to ⭐ the repository and share your feedback.
