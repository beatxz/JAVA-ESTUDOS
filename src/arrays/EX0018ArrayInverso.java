package arrays;

import java.util.Scanner;

public class EX0018ArrayInverso {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[6];


        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite um número: ");
            numero[i] = scanner.nextInt();
        }


        System.out.println("Ordem inversa:");
        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.println(numero[i]);
        }
    }
}