package arrays;

import java.util.Scanner;

public class EX0017ArrayMaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite cinco números: ");
        int[]numeros=new int[5];
        for(int cont=0;cont<numeros.length;cont++){
            numeros[cont]=scanner.nextInt();
        }
        int maiorNumero=numeros[0];
        int menorNumero=numeros[0];
         for(int i=0;i<numeros.length;i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
            if(numeros[i] > maiorNumero){
                menorNumero = numeros[i];
            }
         }

        System.out.println("O maior número é: "+maiorNumero);
        System.out.println("O menor número é: "+menorNumero);
    }
}

