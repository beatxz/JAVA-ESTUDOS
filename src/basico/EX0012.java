package basico;

import java.util.Scanner;

public class EX0012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantas pessoas serão analisadas: ");
        int pessoas= scanner.nextInt();
        int maiores = 0;
        int menores = 0;
        int numeroPar = 0;
        int numeroImpar = 0;


        for(int i = 1; i <= pessoas; i++){
            System.out.println("Digite o nome da " +i+ "º pessoa: ");
            String nome = scanner.next();
            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();

            if(idade < 18){
                ++menores;
                 System.out.println(nome+" é menor de idade");
            }else{
                ++maiores;
                System.out.println(nome+" é maior de idade");

            }
            if(idade %2 == 0){
               ++numeroPar;
            }else{
                ++numeroImpar;
            }

        }
        System.out.println("RESUMO: ");
        System.out.println("Total de pessoas: "+pessoas);
        System.out.println("Total de menores: " +menores);
        System.out.println("Total de maiores: " +maiores);
        System.out.println("Idades impares: " +numeroImpar);
        System.out.println("Idades pares: "+ numeroPar);


    }
}
