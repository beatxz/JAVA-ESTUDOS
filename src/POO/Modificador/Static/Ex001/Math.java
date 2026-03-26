package POO.Modificador.Static.Ex001;

public class Math {
    public static int add(int numberA, int numberB) {
        return numberA + numberB;
    }
    public static double calculateAreaSquared(double side){
        return side*side;
    }
    public static double calculateAreaCircle(double ray){
        double area = 3.14*ray*ray;
        return area;
    }
}
