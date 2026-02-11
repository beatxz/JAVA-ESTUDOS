package condicionais;

import java.util.Scanner;

public class EX006MediaImparPar {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int nUm = scanner.nextInt();
        int parImpar = nUm % 2;
        if (parImpar==0) {
            System.out.println("O numero é par");
        }else {
            System.out.println("O numero é impar");
        }
        if (nUm> 0 ) {
            System.out.println("O numero é positivo");
        } else if (nUm<0 ) {
            System.out.println("O numero é negativo");
        } else {
            System.out.println("O numero é zero");
        }

        System.out.println("Digite outro número: ");
        int nDois = scanner.nextInt();
        int impar = nDois % 2;
        if (impar==0 ){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
        if (nDois>0){
            System.out.println("o numero é positivo");
        } else if (nDois<0){
            System.out.println("O numero é negativo");
        } else {
            System.out.println("O numero é zero");
        }



        System.out.println("Digite outro número: ");
        int nTres = scanner.nextInt();
        int imparpar = nTres % 2;
        if (imparpar==0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
        if (nTres > 0){
            System.out.println("O numero é positivo");
        }else if (nTres<0){
            System.out.println("O numero é negativo");
        } else{
            System.out.println("O numero é zero");
        }




        double media = (nUm+nDois+nTres)/2;
        System.out.println("A média dos números é " +media);














    }
}
