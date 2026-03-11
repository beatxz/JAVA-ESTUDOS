package POO;

public class contaConstrutor {
    private String titular;
    private int numeroDaConta;
    private double saldo;

    public contaConstrutor(String titular, int numeroDaConta) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
    }
    public contaConstrutor(String titular, int numeroDaConta, double saldo) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setnumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public void dadosDaConta(){
        System.out.println("DADOS DA CONTA ");
        System.out.println("Titular: " + this.titular);
        System.out.println("Numero da conta: " + this.numeroDaConta);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Realize um deposito inicial");
    }
    public void dadosAtualizados(){
        System.out.println("DADOS DA CONTA");
        System.out.println("Titular: " + this.titular);
        System.out.println("Numero da conta: " + this.numeroDaConta);
        System.out.println("Saldo: R$" + this.saldo);
    }
    public void deposito(double deposito){
        this.saldo+=deposito;
        System.out.println("Foi realizado um deposito de: R$" + deposito);
    }
    public void saque(double saque){
        if(saque>this.saldo){
            System.out.println("Saldo insuficiente para saque ");
        }else{
            this.saldo-=saque;
            System.out.println("Saque de R$"+saque+" realizado com sucesso");
        }
    }
}
