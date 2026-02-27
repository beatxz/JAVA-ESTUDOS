package Condicionais;

import java.util.Scanner;

public class EX008compradesconto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome : ");
        String nome= scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o valor da sua compra");
        double compra = scanner.nextDouble();
        double desconto = compra * 0.10;
        double valorTotal= compra - desconto;


        if (idade>=60) {
            System.out.println("Olá " +nome+ " o valor final da sua compra é de R$" +valorTotal);
        } else {
            System.out.println("Olá " +nome+ " o valor final da sua compra é de R$" +compra);
        }


        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int ImparPar = numero%2;

        if (ImparPar==0 && numero<0){
            System.out.println("O numero " + numero+ "é um valor par e negativo");
        } else if(ImparPar==1 && numero<0){
            System.out.println("O numero " + numero+ " é um valor impar e negativo");
        } else if(ImparPar==0 && numero>0){
            System.out.println("O numero " + numero+ " é um valor par e positivo");
        } else if(ImparPar==1 && numero>0){
            System.out.println("O numero " + numero+ " é um valor impar e positivo");
        } else if( numero==0){
            System.out.println("O numero " + numero+ " é par e zero");
        }
    }
}
