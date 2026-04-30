package Exception.ExceptionTest.Ex015;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[]args) throws IOException {

        String filePath = "D:\\DEV\\movies.txt";
        boolean addFile = false;
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,addFile));){
            writer.write("Fast and furious");
            writer.write("Duna");
            writer.write("jun");
            writer.write("Ola");
        }catch(Exception error){
            error.printStackTrace();
        }
    }
}
