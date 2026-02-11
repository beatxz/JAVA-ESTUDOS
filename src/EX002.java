import java.util.Scanner;

public class EX002 {
    public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite sua primeira nota: ");
       int notaUm = scanner.nextInt();

       System.out.println("Digite sua segunda nota: ");
       int notaDois = scanner.nextInt();



       if(notaUm>notaDois) {
           System.out.println("O Primeiro valor é maior ");
       } else if (notaUm==notaDois) {
           System.out.println("Os valores são Iguais");
       } else {
           System.out.println("O segundo valor é maior");
       }


    }
}
