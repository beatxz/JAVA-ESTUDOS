package Exception.ExceptionTest.Ex010;

import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                try {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    if (name.trim().isEmpty()) {
                        throw new IllegalArgumentException("Invalid name");
                    }

                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(scanner.nextLine());

                    if (age <= 0) {
                        throw new IllegalArgumentException("Invalid age");
                    }

                    System.out.println("User successfully registered.");
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, please enter a valid number.");

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
