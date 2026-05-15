package POO.File.Ex003FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    static void main(String[] args) {
        File file = new File("file.txt");

        try(FileWriter fw = new FileWriter(file)){
            fw.write("Cause we're collecting moments");
            fw.flush();

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
