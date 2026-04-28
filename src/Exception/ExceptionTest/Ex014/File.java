package Exception.ExceptionTest.Ex014;

import java.io.BufferedReader;
import java.io.FileReader;

public class File {
    public String reader(String filePath) throws Exception{
        String content = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();

            while (line != null) {
                content += line;
                line = reader.readLine();
                if (line != null){
                    content+="\n";
                }

            }
        } catch (Exception error) {
            throw error;
        }
       return content;
    }

}
