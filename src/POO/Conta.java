package POO;

public class Conta {
    private String nome;
    private double saldo=133.2;

    public void setNome (String nome){
        this.nome=nome;
    }

    public void depositar(double valor){
        if(valor<0){
            System.out.println("O valor depositado, não pode ser negativo");
        }else {
            saldo += valor;
        }
    }

    public void saque(double valor){
        if(valor<0){
            System.out.println("O valor deve ser positivo");
        }else if(valor>saldo){
            System.out.println("O valor do saldo é insuficiente");
        } else {
            saldo -= valor;
        }
    }
    public double getSaldo(){
        return saldo;
    }

}

