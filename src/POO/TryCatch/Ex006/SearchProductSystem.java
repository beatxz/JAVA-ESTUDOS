package POO.TryCatch.Ex006;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchProductSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List list = new List();
        list.addProduct(new Product ("Mouse",200));
        list.addProduct(new Product ("Headset",600));
        list.addProduct(new Product ("bean",15));

        while(true) {
            try {

                System.out.print("---------------------");
                System.out.print("\nChose an option: ");
                System.out.print("\n1. Search Product: ");
                System.out.print("\n2. Remove Product: ");
                System.out.print("\n0. Exit: ");
                System.out.print("\n---------------------");
                System.out.print("\nEnter choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    Product find = list.findProduct(productName);

                    if (find != null) {
                        System.out.println("The product found is " + find);
                    } else {
                        System.out.println("The product not found");
                    }
                    break;

                    case 2:
                        System.out.print("Enter product name: ");
                        String removeName =  scanner.nextLine();
                        Product remove = list.removeProduct(removeName);
                        if (remove != null) {
                            System.out.println("Product removed successfully");
                        }else{
                            System.out.println("The product not found");
                        }
                        break;
                    case 0:
                        System.out.println("Thank you for using this program");
                        System.exit(0);

                        default:
                            System.out.println("Invalid choice");


                }

            } catch (InputMismatchException error) {
                System.out.println("Input error, please try again");
                scanner.nextLine();
            }

        }
    }
}
