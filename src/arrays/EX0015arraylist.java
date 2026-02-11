package arrays;

import java.util.ArrayList;

public class EX0015arraylist {
    public static void main(String[] args) {

        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Isabela");
        arrayDinamico.add("Bia");
        arrayDinamico.add("Fabiane");
        arrayDinamico.add("Dudu");
        arrayDinamico.add("Gisele");

        for  (int i = 0; i < arrayDinamico.size(); i++ ) {
            System.out.println(arrayDinamico.get(i));
        }




    }
}
