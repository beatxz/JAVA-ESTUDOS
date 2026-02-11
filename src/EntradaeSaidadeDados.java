import java.util.Scanner;

public class EntradaeSaidadeDados {
    public static void main(String[] args) {

//        System.out.println("Olá eu pulo linha");
//        System.out.print("Olá eu faço impressão na mesma linha");
//        System.out.printf(" Olá eu faço a imprassão formatada");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome : " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Idade: " + idade);

        System.out.println("Digite sim (true) ou não (false): ");
        boolean empredado = scanner.nextBoolean();
        System.out.println("Olá, meu nome é " +nome+ " tenho " +idade+ " anos de idade !");

        System.out.println("Digite seu genero [F/M] : ");
        String genero = scanner.next();
        System.out.println("Seu genero é : "+genero);

    }
}
