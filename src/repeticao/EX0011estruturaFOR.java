package repeticao;

import java.util.Scanner;

public class EX0011estruturaFOR {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas: ");
        int pessoas = scanner.nextInt();
        int menores = 0;
        int maiores = 0;


        for (int i = 1; i <= pessoas; i++) {
            System.out.print("Digite o nome da " + i + "º pessoa: ");
            String nome = scanner.next();
            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();


            if (idade < 18) {
                menores++;
             } else {
                maiores++;
            }


        }
        System.out.println("O total de pessoas maiores de idade: " + maiores);
        System.out.println("O total de pessoas menores de idade: " + menores);

    }


}

