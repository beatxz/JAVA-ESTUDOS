package POO.Constante.Ex003;

public class Discount {
    public static final double DISCOUNT = 0.10;
    public static final double SHIPPING = 15;
    public static final double TAX = 0.05;

    public static double applyDiscount(double product){
        return product-(product*DISCOUNT);
    }
    public static double applyTax(double value){
        return value+(value*TAX);
    }
    public static double applyShipping(double value) {
        if (value >= 200) {
            return value;
        } else {
            return value + SHIPPING;
        }

    }

}
