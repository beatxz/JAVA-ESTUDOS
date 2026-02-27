package POO;

public class AppJava02 {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        heroi.nome = "Homem de ferro";
        heroi.nivel = 10;
        heroi.forca = 9;

        heroi.mostrarStatus();
        heroi.atacar("Loky");

    }
}
