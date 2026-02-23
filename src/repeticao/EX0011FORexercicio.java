package repeticao;

import java.util.Scanner;

public class EX0011FORexercicio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int contPar = 0;
        int contImpar = 0;

        for (int cont = 1; cont <= 5; cont++) {
            System.out.println("Digite um numero: ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }



        }
        System.out.println("Total números Pares: " + contPar);
        System.out.println("Total números Impares: " + contImpar);
    }
}