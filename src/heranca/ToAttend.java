package heranca;

public class ToAttend {
    public static void main(String[]args){
        Series anySeries = new Series("The 100",7,2000);
        Caracter caracter = new Caracter("Isabela");
        System.out.println(caracter);
        Archer archer = new Archer("Bea");
        System.out.println(archer);
        archer.attacked();

    }
}
