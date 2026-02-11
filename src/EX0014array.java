import java.util.Scanner;

public class EX0014array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a idade de 5 pessoas: ");
        int[] idade = new int[5];
        int menor = 0;
        int maior = 0;

        for(int i=0; i<5; i++) {
            System.out.println("Digite uma idade: ");
            idade[i]=scanner.nextInt();

            if(idade[i] >= 18){
                maior++;
            }else {
                menor++;
            }
        }
        System.out.println(" existem "+menor+" menores de idade");
        System.out.println(" existem "+maior+" maiores de idade");
    }
}
