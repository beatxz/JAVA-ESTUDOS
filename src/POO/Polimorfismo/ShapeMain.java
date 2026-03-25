package POO.Polimorfismo;

import java.util.ArrayList;

public class ShapeMain {
    public static void main(String[]args){
        Shape circle =  new Circle();
        Shape square = new Square();
        circle.draw();
        square.draw();

        ArrayList<Shape> shapes=new ArrayList<Shape>();
        shapes.add(circle);
        shapes.add(square);

        for(Shape shape:shapes){
            shape.draw();
        }

    }
}
