package basico;

import java.util.Scanner;

public class EX007CASTING {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("Digite seu nome : ");
        String nome = leitor.nextLine();
        System.out.println("---------------");

        System.out.println("Olá" +nome+ " seja bem vindo");
        System.out.println("---------------");
        System.out.println("Digite seu salário : ");
        double salario = leitor.nextDouble();

        double salarioUm = salario;
        int salarioConvertido = (int) (salario);
        System.out.println(salarioConvertido);



    }
}





