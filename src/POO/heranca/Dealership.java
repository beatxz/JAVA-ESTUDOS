package POO.heranca;

public class Dealership {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("Toyota","Corolla");
        System.out.println("Brand: "+vehicle.getBrand());
        System.out.println("Model: "+vehicle.getModel());
        System.out.println();
        Car car = new Car("Honda","Civic",4);
        car.description();
    }
}
