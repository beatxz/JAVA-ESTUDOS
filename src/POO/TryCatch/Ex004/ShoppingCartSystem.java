package POO.TryCatch.Ex004;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        CartSystem cart = new CartSystem();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            try {
                System.out.println("---------MENU---------");
                System.out.println("1. Add Product");
                System.out.println("2. Show total");
                System.out.println("3. Show products");
                System.out.println("4. Apply discount");
                System.out.println("0. Exit");
                System.out.println("----------------");
                System.out.println("Choice : ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Product name: ");
                        String name =  scanner.next();
                        System.out.println("Product price: ");
                        double price = scanner.nextDouble();
                        Product product = new Product(name, price);
                        cart.addProduct(product);
                        System.out.println("Product added successfully.");
                        break;
                    case 2:
                        System.out.println("The total value is: $" + cart.totalCart());
                        break;
                    case 3:
                        cart.showProducts();
                        break;
                    case 4:
                        System.out.println("the total value with discount is: $"+cart.applyDiscount());
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