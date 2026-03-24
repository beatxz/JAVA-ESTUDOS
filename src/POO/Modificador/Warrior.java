package POO.Modificador;

public class Warrior extends Character{
    @Override
    public void attack() {
        int dataValue = this.rollDice();
        System.out.printf("You rolled a %d on the die.\n",dataValue);
        if (dataValue <3){
            System.out.println("The warrior missed the attack");
        } else if (dataValue == 10) {
            System.out.println("The warrior landed a special blow.");
        } else {
            System.out.println("The warrior struck the enemy!!!");

        }

    }
}
