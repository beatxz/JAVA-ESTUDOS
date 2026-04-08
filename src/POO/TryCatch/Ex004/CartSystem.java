package POO.TryCatch.Ex004;

import java.util.ArrayList;

public class CartSystem {
    private ArrayList<Double>products = new ArrayList<>();


    public void addProduct(Double product){
        products.add(product);
    }
    public double totalCart(){
        double total = 0;
        for(Double d : products){
            total += d;
        }
        return total;
    }
    public void applyDiscount(){
        if (totalCart()>=200){
            double carDiscount =totalCart()-(totalCart()*0.1);
            System.out.println("the total value with discount is: $"+carDiscount);
        }else{
            System.out.println("Unfortunately, the discount does not apply.");
        }
    }
}
