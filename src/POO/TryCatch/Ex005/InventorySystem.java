package POO.TryCatch.Ex005;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InventorySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true){
            try{
                System.out.println("---------MENU---------");
                System.out.println("1. Add item");
                System.out.println("2. Show products");
                System.out.println("3. Show total value");
                System.out.println("4. Search product");
                System.out.println("5. Remove product");
                System.out.println("0. Exit");
                System.out.println("----------------------");
                System.out.println("Enter your choice: ");
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Enter the product name: ");
                        String name = scanner.next();
                        System.out.println("Enter the product price: ");
                        double price = scanner.nextDouble();
                        System.out.println("Enter the product quantity: ");
                        int quantity = scanner.nextInt();
                        inventory.addProduct(new Products(name, price, quantity));
                        break;
                    case 2:
                        inventory.showProducts();
                        break;
                    case 3:
                        System.out.println("The total value is: $"+inventory.calculateTotalValue());
                        break;
                    case 4:
                        scanner.nextLine();
                        System.out.println("Enter the product name: ");
                        String nameFind = scanner.nextLine();

                        Products found = inventory.findProductByName(nameFind);

                        if(found != null){
                            System.out.println("Product found: " + found);
                        } else {
                            System.out.println("Product not found");
                        }
                        break;
                    case 5:
                        System.out.println("Enter the product name: ");
                        inventory.removeProductByName(scanner.next());
                        System.out.println("Product removed successfully");
                        break;
                    case 0:
                        System.out.println("Thank you for using this program...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice, try again");

                }

            }catch (InputMismatchException error){
                System.out.println("INPUT ERROR,PLEASE TRY AGAIN");
                scanner.nextLine();
            }
        }



    }
}
