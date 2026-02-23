package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EX0016ArraySequenciaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite cinco numeros: ");
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        int maiorNumero = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        System.out.println("Os números digitados foram: " + Arrays.toString(numeros));
        System.out.println("O maior numero digitado: " + maiorNumero);
            }

        }

