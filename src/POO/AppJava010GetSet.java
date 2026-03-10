package POO;

public class AppJava010GetSet {
    public static void main(String[]args){

        Conta conta = new Conta();

        conta.setNome("Isabela");
        conta.depositar(500);
        conta.saque(120);


        System.out.println(conta.getSaldo());
    }

}
