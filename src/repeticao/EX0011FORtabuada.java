package repeticao;

import java.util.Scanner;

public class EX0011FORtabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("Digite até quanto quer a tabuada: ");
        int limite = scanner.nextInt();

        for (int i = 1; i<=limite; i++){
            System.out.println(numero+"x"+i+"="+(numero*i));
        }

    }
}






























































