package heranca;

public  class Order {
    private String productName;
    private double price;
    private int quantity;

    public Order(String productName, double price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Name: "+productName+"\nPrice: $"+price+"\nQuantity: "+quantity+"\nTotal: $"+total();
    }
    public double total(){
        return price * quantity;
    }

    public String getProductName(){
        return productName;
    }
    public void setProductName(String  productName){
        this.productName = productName;
    }
    public double getPryce(){
        return price;
    }
    public void setPryce(double price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
