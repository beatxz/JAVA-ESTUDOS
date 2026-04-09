package POO.TryCatch.Ex006;

import java.util.ArrayList;

public class List {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;

            }
        }   return null;
    }
    public Product removeProduct(String productName){
        for (Product product : products){
            if (product.getName().equalsIgnoreCase(productName)){
                products.remove(product);
                return product;
            }
        }
        return null;
    }

}
