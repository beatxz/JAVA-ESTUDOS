package arrays;

import java.util.ArrayList;

public class EX0025ArrayList {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product> ();
        products.add(new Product("Mouse",200.90));
        products.add(new Product("Keyboard",270.90));
        products.add(new Product("Monitor",222.90));

        for(Product Product: products ){
            System.out.println("Product name: "+Product.getName());
            System.out.println("Product price: U$"+Product.getPrice());
        }

    }
}
