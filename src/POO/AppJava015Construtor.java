package POO;

public class AppJava015Construtor {
    public static void main(String[]args){
        contaConstrutor conta=new contaConstrutor("Beatriz",1234,105.6);
        conta.dadosDaConta();
        conta.deposito(300);
        conta.dadosAtualizados();
        conta.saque(100);
        System.out.println("Valor final do saldo: R$"+conta.getSaldo());


    }
}
