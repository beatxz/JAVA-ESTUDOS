package POO.Polimorfismo.Dominio.Ex001;

public class Tomato extends Product{
    public static final double TAX_RATE = 0.06;
    private String expirationDate;


    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("calculating tomato tax...");
        return price * TAX_RATE;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
