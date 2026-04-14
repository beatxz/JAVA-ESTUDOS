package POO.Polimorfismo.Dominio.Ex001;

public class CalculateRate {
    public static void calculateTaxComputer(Computer computer) {
        System.out.println("computer tax report");
        double tax = computer.calculateTax();
        System.out.println("Computer: "+computer.getName());
        System.out.println("Price: "+computer.getPrice());
        System.out.println("Tax: "+tax);

    }
    public static void calculateTaxTomato(Tomato tomato){
        System.out.println("tomato report");
        double tax = tomato.calculateTax();
        System.out.println("Tomato: "+tomato.getName());
        System.out.println("Price: "+tomato.getPrice());
        System.out.println("Tax: "+tax);


    }

}
