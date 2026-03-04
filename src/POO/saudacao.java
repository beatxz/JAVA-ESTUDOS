package POO;

public class saudacao {
    //caracteristicas -->atributos
    String nome ;
    double preco;
    double desconto;
    int a;
    int b;

     void saudar(){
        System.out.println("Olá meu nome é "+nome);
    }
    void subtracao(){
         System.out.println("a subtração dos números é: "+(a-b));
    }
    void adicao(){
         System.out.println("A soma dos números é: "+(a+b));
    }
    void preco(){
         System.out.println("O preço inicial é: "+preco);
    }
    void valorFinal(){
        double valorComDesconto = preco - (preco * desconto);
         System.out.println("O valor final com desconto é: "+valorComDesconto);
    }



}
