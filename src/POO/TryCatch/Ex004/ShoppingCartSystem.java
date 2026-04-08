package POO.TryCatch.Ex004;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        CartSystem cart = new CartSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------MENU---------\n"
                + "1. Add Product\n"
                + "2. Show total\n"
                + "3. Apply discount\n"
                + "0. Exit\n"
                + "----------------\n"
                + "choose an option ");
        while (true) {
            try {
                System.out.println("Choice : ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter price: ");
                        double price = scanner.nextDouble();
                        cart.addProduct(price);
                        break;
                    case 2:
                        System.out.println("The total value is: $" + cart.totalCart());
                        break;
                    case 3:
                        cart.applyDiscount();
                        break;
                    case 0:
                        System.out.println("Thank you for using this program...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice, try again");
                        break;


                }
            } catch (InputMismatchException error) {
                System.out.println("Failed INPUT, TRY AGAIN...");
                scanner.nextLine();
            }
        }
    }
}