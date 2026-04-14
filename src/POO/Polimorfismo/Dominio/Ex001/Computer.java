package POO.Polimorfismo.Dominio.Ex001;

public class Computer extends Product{
    public static final double TAX_RATE = 0.20;

    @Override
    public double calculateTax() {
        System.out.println("calculating computer tax...");
        return this.price * TAX_RATE  ;
    }

    public Computer(String name, double price) {
        super(name, price);
    }
}
