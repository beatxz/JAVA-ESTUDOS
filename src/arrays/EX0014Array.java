package arrays;

import java.util.Scanner;

public class EX0014Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce que digitar: ");
        int quantidade = scanner.nextInt();
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        double soma = 0;


        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextInt();
            soma = soma + numeros[i];

            if (numeros[i] == 0) {
                maior = numeros[i];
                menor = numeros[i];
            }else {
                if (numeros[i]>maior) {
                    maior = numeros[i];
                }
                if (numeros[i]<menor) {
                    menor = numeros[i];
                }
        }

            }
        double media= soma/quantidade;
        System.out.println("Soma : " +soma);
        System.out.println("Media : " +media);
        System.out.println("Maior : " +maior);
        System.out.println("Menor : " +menor);

        }

    }
