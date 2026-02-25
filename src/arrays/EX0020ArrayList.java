package arrays;

import java.util.ArrayList;

public class EX0020ArrayList {
    public static void main(String[] args) {

        // ArrayList<Tipo>nome = new ArrayList<tipo();
        ArrayList<String>arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Isabela");
        arrayDinamico.add("Bea");
        arrayDinamico.add("Gisele");
        arrayDinamico.add("Gigi");
        arrayDinamico.add("Fabi");
        arrayDinamico.add("Isa");

        for(int i = 0; i<arrayDinamico.size();i++) {
            System.out.println(arrayDinamico.get(i));
        }

        System.out.println("Tamanho do arrayList "+arrayDinamico.size());




    }
}
