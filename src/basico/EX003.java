package basico;

import java.util.Scanner;

public class EX003 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("seja bem vindo(a) " +nome);

        System.out.println("Digite sua primeira nota: ");
        double nota = scanner.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double notaDois = scanner.nextDouble();

        double valortotal = (nota+notaDois)/2;

        System.out.println( nome+ " A sua media é " + valortotal);


    }
}
