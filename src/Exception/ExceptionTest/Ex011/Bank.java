package Exception.ExceptionTest.Ex011;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    public static void main(String[]args){
        try(Scanner scanner = new Scanner(System.in)){

            double balance = 100;


            while(true){
                try{
                    System.out.println("-----------------");
                    System.out.println("MENU");
                    System.out.println("1- Withdraw");
                    System.out.println("2- Exit");
                    System.out.println("-----------------");
                    System.out.println("Enter Your choice: ");
                    int choice = scanner.nextInt();

                    switch (choice){
                        case 1:
                            System.out.println("Enter amount: ");
                            double amount = scanner.nextDouble();
                            if(amount>balance){
                                throw new IllegalArgumentException("insufficient balance,try again");
                            }
                            if(amount<=0){
                                throw new IllegalArgumentException("invalid value,try again");
                            }

                            balance -= amount;

                            System.out.println("Withdraw successful");
                            System.out.println("Balance: "+balance);
                            break;

                        case 2:
                            System.out.println("Thank you for using this program...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }

                }catch(InputMismatchException e){
                    System.out.println("invalid entry");
                    scanner.nextLine();
                }
            }
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
