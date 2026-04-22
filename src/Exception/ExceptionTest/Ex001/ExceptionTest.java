package Exception.ExceptionTest.Ex001;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class ExceptionTest {
    public static void main(String[]args)throws IOException{
        createNewFile();

    }
    private static void createNewFile()throws IOException{
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("file created successfully!");
        }catch(IOException e){
            e.printStackTrace();
            throw e;
        }


    }
}
