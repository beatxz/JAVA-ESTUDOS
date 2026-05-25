package HashMap.Ex001;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String,Double> studentNotes = new HashMap<>();


        studentNotes.put("Isabela",10.5);
        studentNotes.put("Bea",1.5);
        studentNotes.put("Giselle",13.5);

        for(String name : studentNotes.keySet()){
            double note = studentNotes.get(name);
            System.out.println(name+" : "+note);
        }

        studentNotes.get("Isabela");

    }
}
