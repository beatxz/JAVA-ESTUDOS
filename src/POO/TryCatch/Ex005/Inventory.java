package POO.TryCatch.Ex005;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Products> products =  new ArrayList<Products>();

    public void addProduct(Products product){
        products.add(product);
    }
    public void showProducts(){
        for(Products p : products){
            System.out.println(p);
        }
    }
    public double calculateTotalValue(){
        double total = 0;
        for(Products p : products){
            total += p.getPrice()*p.getQuantity();
        }
        return total;
    }
    public Products findProductByName(String name){
        for(Products p : products){
            if(p.getName().equalsIgnoreCase(name)){
                return p;
            }


        } return null;
    }
    public Products removeProductByName(String name){
        for(Products p : products){
            if(p.getName().equalsIgnoreCase(name)){
                products.remove(p);
                return p;
            }
        }
        return null;
    }

}
