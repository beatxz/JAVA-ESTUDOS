package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class EX0023ArrayListTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer>numeros=new ArrayList<>();

        for (int i= 0;i<5;i++) {
            System.out.println("Digite cinco numeros: ");
            numeros.add(scanner.nextInt());
        }
        int menor = numeros.get(0);
        for (int i= 0;i<numeros.size();i++) {
            if (numeros.get(i) < menor) {
                menor = numeros.get(i);
            }
        }
        System.out.println(numeros);
        System.out.println("Menor: "+menor);
    }
}
