package POO.Polimorfismo.Dominio.Ex001;

public class Tomato extends Product{
    public static final double TAX_RATE = 0.06;


    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("calculating tomato tax...");
        return price * TAX_RATE;
    }
}
