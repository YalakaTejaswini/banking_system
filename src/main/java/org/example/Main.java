package org.example;

import org.example.repository.BankRepository;
import org.example.service.BankService;
import org.example.service.TransferService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankRepository repository = new BankRepository();

        BankService bankService = new BankService(repository);
        TransferService transferService = new TransferService(repository);

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("========== BANK TRANSFER SYSTEM ==========");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Money");
            System.out.println("6. View All Accounts");
            System.out.println("7. View Transaction History");
            System.out.println("8. Exit");

            System.out.print("\nEnter your choice : ");

            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:

                        System.out.print("Enter Account Number : ");
                        long accountNumber = sc.nextLong();

                        sc.nextLine(); // Consume newline

                        System.out.print("Enter Account Holder Name : ");
                        String name = sc.nextLine();

                        System.out.print("Enter Initial Balance : ");
                        double balance = sc.nextDouble();

                        bankService.createAccount(accountNumber, name, balance);

                        break;

                    case 2:

                        System.out.print("Enter Account Number : ");
                        long depositAcc = sc.nextLong();

                        System.out.print("Enter Deposit Amount : ");
                        double depositAmount = sc.nextDouble();

                        bankService.deposit(depositAcc, depositAmount);

                        break;

                    case 3:

                        System.out.print("Enter Account Number : ");
                        long withdrawAcc = sc.nextLong();

                        System.out.print("Enter Withdraw Amount : ");
                        double withdrawAmount = sc.nextDouble();

                        bankService.withdraw(withdrawAcc, withdrawAmount);

                        break;

                    case 4:

                        System.out.print("Enter Account Number : ");
                        long balanceAcc = sc.nextLong();

                        bankService.checkBalance(balanceAcc);

                        break;

                    case 5:

                        System.out.print("From Account : ");
                        long from = sc.nextLong();

                        System.out.print("To Account : ");
                        long to = sc.nextLong();

                        System.out.print("Amount : ");
                        double amount = sc.nextDouble();

                        transferService.transfer(from, to, amount);

                        break;

                    case 6:

                        bankService.viewAllAccounts();

                        break;

                    case 7:

                        transferService.showTransactionHistory();

                        break;

                    case 8:

                        running = false;
                        System.out.println("\nThank you for using Bank Transfer System.");

                        break;

                    default:

                        System.out.println("Invalid Choice.");

                }

            } catch (RuntimeException e) {

                System.out.println("\n❌ " + e.getMessage());

            }

        }

        sc.close();

    }
}