package POO.Constante.Ex002;

public class DiscountMain {
    public static void main(String[] args) {

        double product = 100;

        double valueWithDiscount = Discount.applyDiscount(product);
        double finalValue = Discount.applyTax(valueWithDiscount);

        System.out.printf("Original: $%.2f%n", product);
        System.out.printf("With discount: $%.2f%n", valueWithDiscount);
        System.out.printf("Final with fee:  $%.2f%n", finalValue);
    }
}