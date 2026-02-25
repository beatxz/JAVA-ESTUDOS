package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class EX0022ArrayListtt {
    public static void main(String[] args) {
        System.out.println("Lista de números ordenada: ");
        ArrayList<Integer>numeros=new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(7);
        numeros.add(0);
        numeros.add(33);
        numeros.add(24);
        numeros.add(23);
        numeros.add(35);
        Collections.sort(numeros);

        for(Integer numero: numeros){
            System.out.println(numero);
        }
        System.out.println("Lista de nomes ordenada: ");
        ArrayList<String>nomes=new ArrayList<String>();
        nomes.add("Isabela");
        nomes.add("Gisele");
        nomes.add("Bia");
        nomes.add("Fabi");
        nomes.add("Isabel");
        nomes.add("Luana");

        Collections.sort(nomes);
        for(String nome: nomes){
            System.out.println(nome);
        }

    }
}
