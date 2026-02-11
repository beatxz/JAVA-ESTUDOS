package condicionais;

import java.util.Scanner;

public class EX0010descontos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Olá, digite seu nome: ");
//        String nome = scanner.nextLine();
//        System.out.println( nome+ " Digite seu salario: ");
//        double salario = scanner.nextDouble();
//        double aumentoUm = salario+(salario*0.15);
//        double aumentoDois = salario+(salario*0.10);
//        double aumentoTres = salario+(salario*0.05);
//
//        if(salario<2000) {
//            System.out.println(nome+ " Seu salario com aumento é : R$"+aumentoUm);
//        }else if (salario>=2000 && salario<4000) {
//            System.out.println(nome+ " Seu salario com aumento é : R$"+aumentoDois);
//        }else if (salario>=4000 ) {
//            System.out.println(nome+ " Seu salario com aumento é : R$"+aumentoTres);
//        }

         System.out.println("Digite um numero: ");
         int numeroUm = scanner.nextInt();
         System.out.println("Digite outro numero: ");
         int numeroDois = scanner.nextInt();

         if (numeroUm==numeroDois){
             System.out.println("Os numeros são iguais");
         } else {
             System.out.println("Os numeros são diferentes");
         }
         if (numeroUm>0 && numeroDois>0){
             System.out.println("Ambos são positivos");
         }else if (numeroUm>0 && numeroDois<0){
             System.out.println("O numero " +numeroUm+" é positivo e o numero "+numeroDois+" é negativo");
         }else if (numeroUm<0 && numeroDois>0){
             System.out.println("O numero " +numeroUm+" é negativo e o numero "+numeroDois+" é positivo");
         }else if (numeroUm<0 && numeroDois<0){
             System.out.println("Ambos são negativos");
         }else {
             System.out.println("Pelo o menos um numero é zero");
         }

    }
}
