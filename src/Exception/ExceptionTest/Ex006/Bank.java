package Exception.ExceptionTest.Ex006;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the withdrawal amount: ");
            double amount = scanner.nextDouble();
            withdraw(amount);
        } catch (IllegalArgumentException  e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void withdraw(double value) {

        double balance = 100;

        if (value > balance) {
            throw new RuntimeException("Insufficient balance");
        }
        if (value <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }

        System.out.println("Withdrawal made");
    }
}
