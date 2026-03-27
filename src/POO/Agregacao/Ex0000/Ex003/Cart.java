package POO.Agregacao.Ex0000.Ex003;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product>products = new ArrayList<Product>();

    public void addProduct(Product product){
        products.add(product);
    }
    public double totalCart(){
        double total = 0;
        for(Product product : products){
            total += product.total();
        }
        return total;
    }
    public ArrayList<Product> getProducts(){
        return products;
    }
    public Product searchProduct(String name) {
        for(Product product : products){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
}
