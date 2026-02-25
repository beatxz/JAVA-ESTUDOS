package arrays;

import java.util.Scanner;

public class EX0019Polindromo {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        int[]numeros=new int[5];


        for(int i=0;i<numeros.length;i++) {
            System.out.print("Digite um numero de [" + (i + 1) + "/5" + "] : ");
            numeros[i] = scanner.nextInt();
        }
             if (numeros[0]==numeros[4]&&numeros[1]==numeros[3]){
                  System.out.println("È um polidromo");
             } else System.out.println("Não é um polidromo");
        }

    }
