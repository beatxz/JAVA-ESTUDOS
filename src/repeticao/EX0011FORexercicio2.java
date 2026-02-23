package repeticao;

import java.util.Scanner;

public class EX0011FORexercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma= 0;
        int maiorNumero= 0;

        for (int i = 1; i<=8;i++) {
            System.out.println("Digite um numero: ");
            int num = scanner.nextInt();
            soma = soma+num;

            if(maiorNumero<=num){
                maiorNumero=num;
            }

        }
        System.out.println("a soma de todos os numeros é: "+soma);
        System.out.println("O maior número é: "+maiorNumero);
    }
}
