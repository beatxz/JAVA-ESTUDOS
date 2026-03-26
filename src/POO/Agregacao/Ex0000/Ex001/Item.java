package POO.Agregacao.Ex0000.Ex001;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String toString(){
        String information = String.format("Name: %s\nPrice: %.2f\nQuantity: %d\nTotal: %d",name,price,quantity,total());;
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
