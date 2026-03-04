package POO;

public class AppJava04 {
    public static void main(String[] args) {
        contaBancaria banco = new contaBancaria();
        banco.nome="Bia";
        banco.saldo=100;

        banco.depositar(90);
        banco.saque(30);
        banco.mostrarSaldo();


    }
}
