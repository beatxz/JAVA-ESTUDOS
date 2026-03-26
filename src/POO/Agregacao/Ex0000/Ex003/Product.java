package POO.Agregacao.Ex0000.Ex003;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String toString(){
        String information = String.format("Product: %s\n Price: %.2f\n Quantity: %d", name, price, quantity);
        return information;
    }

    public double total(){
        return price * quantity;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
