package HashMap.Ex001;

import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
        TreeMap<String,Double> studentNotes = new TreeMap<>();

        studentNotes.put("Isabela",10.5);
        studentNotes.put("Bea",1.5);
        studentNotes.put("Giselle",13.5);

        for(String name : studentNotes.keySet()){
            double note = studentNotes.get(name);
            System.out.println(name+" : "+note);
        }
        System.out.println("First key: "+studentNotes.firstKey());

    }

    }

