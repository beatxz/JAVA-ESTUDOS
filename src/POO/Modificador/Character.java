package POO.Modificador;

import java.util.Random;

public abstract class Character {

    public abstract void attack();

    public int rollDice(){
        Random rand = new Random();
        int num =1+ rand.nextInt(40);
        return num;
    }

}
