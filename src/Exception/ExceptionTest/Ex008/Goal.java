package Exception.ExceptionTest.Ex008;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Goal {
    public static void main(String[]args){
        try(Scanner scanner = new Scanner(System.in)){


            while(true) {
                try {
                    System.out.println("Enter a number: ");
                    int num = scanner.nextInt();
                    System.out.println("You entered: " + num);
                    break;

                }catch(InputMismatchException e){
                    System.out.println("Invalid input, please try again...");
                    scanner.nextLine();
                }

            }

        }
    }
}
