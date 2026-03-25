package POO.Polimorfismo;

public class ShapeMain {
    public static void main(String[]args){
        Shape circle =  new Circle();
        Shape square = new Square();
        circle.shape();
        square.shape();
    }
}
