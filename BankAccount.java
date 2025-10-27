package Task5.BankAccountSimulation;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
        final String accountNumber;
        final String accountHolderName;
        private double balance;
        final ArrayList<String> transactions;

        // Constructor
        public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
            this.transactions = new ArrayList<>();
            transactions.add("Account created with initial balance: " + initialBalance);
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                transactions.add("Deposited: " + amount);
                System.out.println("Successfully deposited ₹" + amount);
            } else {
                System.out.println("Invalid deposit amount!");
            }
        }

         public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                transactions.add("Withdrew: " + amount);
                System.out.println("Successfully withdrew ₹" + amount);
            } else {
                System.out.println("Insufficient balance or invalid amount!");
            }
        }

        public void showBalance() {
            System.out.println("Current Balance: ₹" + balance);
        }

          public void showTransactions() {
             System.out.println("\n Transaction History:");
            for (String t : transactions) {
                 System.out.println("- " + t);
            }
        }
    }

