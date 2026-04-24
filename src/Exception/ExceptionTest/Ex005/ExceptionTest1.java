package Exception.ExceptionTest.Ex005;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
    public static void main(String[]args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("the number entered was: "+num);

        }catch(InputMismatchException e){
            System.out.println("Input error, please try again.");

        }
    }
}
