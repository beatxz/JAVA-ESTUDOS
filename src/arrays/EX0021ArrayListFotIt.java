package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class EX0021ArrayListFotIt {
    public static void main(String[] args) {
        // ArrayList<Tipo>nome = new ArrayList<tipo();

        ArrayList<String>ArrayDinamico=new ArrayList<String>();
        ArrayDinamico.add("Isabela");
        ArrayDinamico.add("Beatriz");
        ArrayDinamico.add("Carla");

        for(String nome: ArrayDinamico){
            System.out.println(nome);

        }
    }
}
