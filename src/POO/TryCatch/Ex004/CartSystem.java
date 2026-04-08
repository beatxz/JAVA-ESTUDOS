package POO.TryCatch.Ex004;
import java.util.ArrayList;

public class CartSystem {
    private ArrayList<Product>products = new ArrayList<Product>();


    public void addProduct(Product product){
        products.add(product);
    }
    public double totalCart(){
        double total = 0;
        for(Product p : products){
            total += p.getPrice();
        }
        return total;
    }

    public void showProducts(){
        for(Product p : products){
            System.out.println(p);
        }
    }
    public double applyDiscount(){
        double total = totalCart();

        if (total >= 500){
            return total - (total * 0.1);
        } else {
            return total;
        }
    }
}

