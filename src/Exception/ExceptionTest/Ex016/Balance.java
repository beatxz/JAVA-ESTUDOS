package Exception.ExceptionTest.Ex016;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Balance {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            double balance = loadBalance();

            while (true) {
                try {
                    System.out.println("-----------------");
                    System.out.println("MENU");
                    System.out.println("1 - Withdraw");
                    System.out.println("2 - Deposit");
                    System.out.println("3 - Show Balance");
                    System.out.println("0 - Exit");
                    System.out.println("-----------------");
                    System.out.print("Enter your choice: ");

                    int choice = scanner.nextInt();

                    switch (choice) {

                        case 1:
                            System.out.print("Enter amount: ");
                            double amount = scanner.nextDouble();

                            if (amount <= 0) {
                                throw new IllegalArgumentException("Invalid amount");
                            }

                            if (amount > balance) {
                                throw new IllegalArgumentException("Insufficient balance");
                            }

                            balance -= amount;
                            saveBalance(balance);

                            System.out.println("Withdraw successful");
                            break;

                        case 2:
                            System.out.print("Enter amount: ");
                            double deposit = scanner.nextDouble();

                            if (deposit <= 0) {
                                throw new IllegalArgumentException("Invalid amount");
                            }

                            balance += deposit;
                            saveBalance(balance);

                            System.out.println("Deposit successful");
                            break;

                        case 3:
                            System.out.println("Balance: " + balance);
                            break;

                        case 0:
                            System.out.println("Thank you for using this program...");
                            return;

                        default:
                            System.out.println("Invalid choice");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input");
                    scanner.nextLine();

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static double loadBalance() {
        try (BufferedReader br = new BufferedReader(new FileReader("balance.txt"))) {
            String line = br.readLine();
            return Double.parseDouble(line);
        } catch (Exception e) {
            return 100;
        }
    }

    public static void saveBalance(double balance) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("balance.txt"))) {
            bw.write(String.valueOf(balance));
        } catch (Exception e) {
            System.out.println("Error saving balance");
        }
    }
}