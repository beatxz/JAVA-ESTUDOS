import java.util.Scanner;

public class EX001 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Qual sua idade: ");
        double idade = scanner.nextDouble();

        if (idade >= 18) {
            System.out.println("Sua entrada está permitida. Bem vindo(a)" + nome + "!");
        }
        else  {
            System.out.println("Acesso negado");

        }



    }
}
