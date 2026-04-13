package POO.Exercicios.Ex011;

public class Xadrez implements Jogo {
    @Override
    public void fechar() {
        System.out.println("Fechando jogo de xadrez");
    }

    @Override
    public void jogar() {
        System.out.println("Exibir menu");
        System.out.println("Exibir videos de jogada no fundo");

    }
}
