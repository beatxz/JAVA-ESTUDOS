package POO.heranca;


public class Archer extends Caracter{
    private String arm;

    public Archer(String name) {
        super(name);
        setLevel(6);
        setClasse("Archer");
        this.arm = "bow";
    }
    @Override
    public String toString(){
        String informationCaracter= super.toString();
        String informationArcher= String.format(" - Arm : %s",arm);
        return informationCaracter+informationArcher;
    }
    @Override
    public void attacked(){
        System.out.println("Archer attacked with "+arm);
    }
}
