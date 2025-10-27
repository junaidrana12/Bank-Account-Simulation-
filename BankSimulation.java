package Task5.BankAccountSimulation;

import java.util.Scanner;

public class BankSimulation {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Create a sample account
             System.out.print("Enter Account Number: ");
            String accNo = sc.nextLine();
            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();
             System.out.print("Enter Initial Balance: ");
            double initialBalance = sc.nextDouble();

            BankAccount account = new BankAccount(accNo, name, initialBalance);
            int choice;
            do {
                 System.out.println("\n### Bank Menu ####");
                System.out.println("1. Deposit");
                 System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                 System.out.println("4. Show Transaction History");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                      case 1:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        account.deposit(dep);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double wd = sc.nextDouble();
                        account.withdraw(wd);
                        break;
                        case 3:
                        account.showBalance();
                        break;
                    case 4:
                        account.showTransactions();
                        break;
                    case 5:
                        System.out.println("Thank you for using our banking system!");
                        break;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            } while (choice != 5);

            sc.close();
        }
    }
