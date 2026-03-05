package POO;

public class AppJava06 {
    public static void main(String[] args) {
        Carro carroUm = new Carro();
        carroUm.modelo="Punto";
        carroUm.cor="Verde";
        carroUm.velocidadeMaxima= 120;
        carroUm.velocidadeAtual=90;

        carroUm.acelerar(10);
        carroUm.freiar();

        Carro carroDois = new Carro();
        carroDois.modelo="Palio";
        carroDois.cor="Verde";
        carroDois.velocidadeMaxima= 220;
        carroDois.velocidadeAtual=15;

        carroDois.acelerar(100);
        carroDois.freiar();

        Carro carroTres = new Carro();
        carroDois.modelo="Civic";
        carroDois.cor="Verde";
        carroDois.velocidadeMaxima= 300;
        carroDois.velocidadeAtual=150;

        carroDois.acelerar(100);
        carroDois.freiar();










    }
}
