package POO.TryCatch.Ex001;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            int result = 100/number;

            System.out.println("100/"+number+"\nResult: "+result);
        }catch(ArithmeticException error){
            System.out.println("Division by zero");
        }catch(InputMismatchException error){
            System.out.println("Incorrect input ");
        }
        scanner.close();
    }
}
