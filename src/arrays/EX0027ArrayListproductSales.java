package arrays;

import java.util.ArrayList;

public class EX0027ArrayListproductSales {
    public static void main(String[] args) {

        ArrayList<ProductSales>products=new ArrayList<>();
        products.add(new ProductSales("Mouse",200,2));
        products.add(new ProductSales("Headset",89,1));
        products.add(new ProductSales("Notbook",3000,1));

        double total =0;
        for (ProductSales product : products){
            System.out.println("Product: "+product.getName()+" Price: "+product.getPrice()+" Quantity: "+product.getQuantity());

            total+=product.getPrice()*product.getQuantity();
        }

        System.out.println("Total purchase value: $"+total);
        Payment pix =  new Pix();
        pix.pay(total);
        }









}
