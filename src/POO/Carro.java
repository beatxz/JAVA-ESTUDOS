package POO;

public class Carro {
    String modelo;
    String cor;
    int velocidadeMaxima;
    int velocidadeAtual;

    void acelerar(int valor) {

        velocidadeAtual += valor;
        if (velocidadeAtual > velocidadeMaxima) {
            System.out.println("A velocidade máxima permitida é: " + velocidadeMaxima + "Km/h");
        } else {
            System.out.println("Seu carro "+modelo+" está acelerando: " + velocidadeAtual + "Km/h");
        }

    }
    void freiar(){
            System.out.println("Voce está freiando");
            System.out.println("O carro esta a: 0Km/h");

    }
}

