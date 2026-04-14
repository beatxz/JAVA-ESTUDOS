package POO.File.Ex001;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderUtil {

    public String read(String filePath){
        String content = "";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String line = reader.readLine();

            while (line != null){
                content += line + "\n";
                line = reader.readLine();
            }

        }catch(Exception error){
            System.out.println("There was a problem reading the file.");
        }

        return content;
    }
}