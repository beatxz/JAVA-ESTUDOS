package repetição;

import java.util.Scanner;

public class EX0011FORSomaPares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número intero positivo: ");
        int numero = scanner.nextInt();
        int soma = 0;

        for (int contador = 0; contador <= numero; contador++)
            if(contador%2==0) {
                soma = soma + contador;
            }



        System.out.println("A soma de todos os numeros pares é de: " +soma);
    }



}
