package Exception.ExceptionTest.Ex004;

import java.io.IOException;

public class TryWithResources01 {
    public static void main(String[]args) throws IOException {
     readFile();
    }
    public static void readFile()throws IOException{
        try(Reader1 reader1 = new Reader1();
        Reader2 reader2 = new Reader2()){

        }catch(IOException e){

        }
    }
}
