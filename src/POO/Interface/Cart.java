package POO.Interface;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public double totalCart(){
        double total = 0;
        for(Product p : products){
            total += p.total();
        }
        return total;
    }
}