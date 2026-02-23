package repeticao;

import java.util.Scanner;

public class EX0013DOWHILE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        int contador = 0;

        while (numero != 0) {
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();

            if (numero != 0) {

              contador++;

            }


        }
        System.out.println(" Foram contados " + contador+" numeros ");
    }



}