package repetição;

import java.util.Scanner;

public class EX0011ForNumerosPrimos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        int menor = num;
        int maior = num;


        for(int cont =0; cont<4;cont++) {
            System.out.println("Digite um numero: ");
            num = scanner.nextInt();


            if (num > maior)
                maior=num;
            if (num < menor)
                menor=num;

        }

        System.out.println("Menor numero: " + menor);
        System.out.println("Maior numero: " + maior);


   }
}
