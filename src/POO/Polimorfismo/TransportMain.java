package POO.Polimorfismo;

import java.util.ArrayList;

public class TransportMain {
    public static void main(String[]args){
        Transport plane = new Plane();
        Transport car = new Car();
        Transport bike = new Bike();
        ArrayList<Transport> transports=new ArrayList<Transport>();
        transports.add(plane);
        transports.add(bike);
        transports.add(car);

        for(Transport transport : transports){
            transport.move();
        }

    }
}
