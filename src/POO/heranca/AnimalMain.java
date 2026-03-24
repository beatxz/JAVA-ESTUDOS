package POO.heranca;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[]args){
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat("Giselle"));
        animals.add(new Dog("Gigi"));

        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}
