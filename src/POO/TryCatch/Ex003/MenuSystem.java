package POO.TryCatch.Ex003;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuSystem{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            try{

                System.out.println("---------MENU---------");
            System.out.println(" 1-Calculate discount\n " +
                    "2-Calculate tax\n " +
                    "3-Calculate shipping\n " +
                    "0-Exit\n----------------------\n"+
                    " choose an option: ");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter the amount");
                    double amount = scanner.nextDouble();
                    double result = amount - (amount * 0.1);
                    System.out.println("Result: $" + result);
                    break;
                case 2:
                    System.out.println("Enter the amount: ");
                    double amountTax = scanner.nextDouble();
                    double resultTax = amountTax + (amountTax * 0.05);
                    System.out.println("Result: $" + resultTax);
                    break;
                case 3:
                    System.out.println("Enter the amount: ");
                    double amountShipping = scanner.nextDouble();
                    double shipping = 15;
                    if (amountShipping < 200) {
                        shipping =  amountShipping+shipping;
                        System.out.println("Result shipping: $" + amountShipping);
                    } else {
                        System.out.println("Free shipping $" + shipping);
                    }
                    break;
                case 0:
                    System.out.println("Thank you for using this program...");
                    System.exit(0);
                    ;
                default:
                    System.out.println("Invalid choice");
            }
            }catch(InputMismatchException error){
                System.out.println("INCORRECT INPUT, TRY AGAIN ");
                scanner.nextLine();

            }

        }
    }
}
