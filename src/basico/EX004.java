package basico;

import java.util.Scanner;

public class EX004 {
    public static void main (String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        double notaUm = scanner.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double notaDois = scanner.nextDouble();

        double ValorTotal = (notaUm+notaDois)/2;

        System.out.println("Sua média é: "+ValorTotal);

        if (ValorTotal>= 7) {
            System.out.println(nome+ " voce está aprovado");
        } else if (ValorTotal>=5){
            System.out.println(nome +" voce está de recuperação");
        } else {
            System.out.println(nome+" voce esta reprovado");
        }

    }
}
