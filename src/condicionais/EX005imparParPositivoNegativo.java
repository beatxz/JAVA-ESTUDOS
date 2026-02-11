package condicionais;

import java.util.Scanner;

public class EX005imparParPositivoNegativo {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int parOuImpar = numero % 2;


        if(parOuImpar == 0 ) {
            System.out.println("o numero é Par");
        } else if (parOuImpar == 1) {
            System.out.println("O numero é impar");
        }

        if (numero >0) {
            System.out.println(" O numero é positivo");
        }else if  (numero <0 ) {
            System.out.println("O numero é negativo");
        }else if  (numero == 0) {
            System.out.println("O valor é zero");
        }

    }
}
