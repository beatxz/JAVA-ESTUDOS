package heranca;

public class Car extends Vehicle {
    private int numberOfDoors;
    public Car(String brand, String model,int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors=numberOfDoors;
    }
    public void description(){
        System.out.println("Description: Car");
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Model: " + this.getModel());
        System.out.println("Number of Doors: " + this.getNumberOfDoors());
    }
}
