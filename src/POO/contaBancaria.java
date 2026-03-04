package POO;

public class contaBancaria {
    String nome;
    double saldo;


    void depositar(double deposito) {
        saldo +=deposito;
        System.out.println("O valor do final do saldo com deposito é: R$"+saldo);
    }
    void saque(double saque) {
        if (saldo >= saque) {
            saldo -= saque;
            System.out.println("O valor de R$"+saque+" foi sacado com sucesso!");
        } else {
            System.out.println("Valor insuficiente");
        }
    }
        void mostrarSaldo(){
        System.out.println("o valor final é: R$"+saldo);

        }

    }

