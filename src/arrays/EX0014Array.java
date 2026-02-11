package arrays;

import java.util.Scanner;

public class EX0014Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce que digitar: ");
        int quantidade = scanner.nextInt();
        int maior = 0, menor = 0;
        double soma=0;

        int[] numeros = new int[quantidade];

        for(int i=0;i<quantidade;i++){
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextInt();

        }




    }
}
