package POO.Constante.Ex002;

public class Discount {
    public static final double DISCOUNT = 0.10;
    public static final double TAX = 0.05;

    public static double calculateDiscount(double product){
        return product  * DISCOUNT;
    }
    public static double applyDiscount(double product){
         return product -  calculateDiscount(product);
    }
    public static double applyTax(double value ){
        return value + (value * TAX);
    }

}
