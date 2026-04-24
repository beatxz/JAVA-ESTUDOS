package Exception.ExceptionTest.Ex007;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader1 {
    public static void main(String[]args){

        try(BufferedReader br = new BufferedReader(new FileReader("src/Exception/ExceptionTest/Ex007/dados.txt"))){

            String line;

            while((line = br.readLine()) != null){

            System.out.println(line);}

        }catch(IOException e){
            System.out.println("Error opening file.");
        }
    }
}
