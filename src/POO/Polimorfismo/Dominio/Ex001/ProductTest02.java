package POO.Polimorfismo.Dominio.Ex001;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen",1500);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.calculateTax());

        Product product2 = new Tomato("Yellow",10);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTax());



    }
}
