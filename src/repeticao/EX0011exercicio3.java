package repeticao;

import java.util.Scanner;

public class EX0011exercicio3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = scanner.nextDouble();
        double soma= num;
        double media= 0;

        for (int cont = 1; cont<6; cont++){
            System.out.println("Digite outro número: ");
            num = scanner.nextDouble();
            soma = soma + num;
            media = soma/6;

        }
        System.out.println("A soma total é: " +soma);
        System.out.println("A média total é: " +media);
    }
}
