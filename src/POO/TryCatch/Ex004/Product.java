package POO.TryCatch.Ex004;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return "\nName: " + name + "Price: $" + price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
}
