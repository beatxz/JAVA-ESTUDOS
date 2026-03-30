package POO.Constante.Ex003;

import java.util.Scanner;

public class DiscountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double product = scanner.nextDouble();

        double valueWithDiscount = Discount.applyDiscount(product);
        double valueWithTax = Discount.applyTax(valueWithDiscount);
        double valueWithShipping = Discount.applyShipping(valueWithTax);


        System.out.printf("Value with discount: $%.2f%n",valueWithDiscount);
        System.out.printf("Value including tax: $%.2f%n",valueWithTax);
        System.out.printf("Value With Shipping: $%.2f%n",valueWithShipping);

        scanner.close();

    }
}
