package POO.TryCatch.Ex002;

import java.util.InputMismatchException;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;

        while (number != 0) {
            try {
                System.out.println("Enter a number: ");
                number = scanner.nextInt();

                int result = 100 / number;
                System.out.println("Result: 100/" + number + " = " + result);

            } catch (InputMismatchException error) {
                System.out.println("Incorrect input");
                scanner.nextLine();

            } catch (ArithmeticException error) {
                System.out.println("Cannot divide by zero. Closing program...");
                number = 0;
            }
        }
    }
}