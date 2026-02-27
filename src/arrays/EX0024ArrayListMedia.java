package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class EX0024ArrayListMedia {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Quantos números você quer digitar?: ");
        int quantidade = scanner.nextInt();
        ArrayList<Double> numeros = new ArrayList<>();
        double soma=0;
        for(int i =1; i<=quantidade;i++){
            System.out.println("Digite um número de ["+i+"/"+quantidade+"] ");
            double valor=scanner.nextDouble();
            numeros.add(valor);
            soma+=valor;
        }
        double media = (soma/quantidade);
        System.out.println("A soma total é: "+soma);
        System.out.println("A média dos valores é:"+media);

    }
}
