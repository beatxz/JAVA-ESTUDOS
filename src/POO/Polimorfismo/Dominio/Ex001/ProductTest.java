package POO.Polimorfismo.Dominio.Ex001;

public class ProductTest {
    public static void main(String[]args){
        Computer computer = new Computer("Dell",11000);
        Tomato tomato = new Tomato("Tomato",120);
        CalculateRate.calculateTaxComputer(computer);
        System.out.println("-----------------");
        CalculateRate.calculateTaxTomato(tomato);
    }
}
