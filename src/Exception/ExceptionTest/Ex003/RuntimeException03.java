package Exception.ExceptionTest.Ex003;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeException03 {
    public static void main(String[]args){
        try{
            throw new ArrayIndexOutOfBoundsException();

        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException  e){
            System.out.println("Inside the ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Inside the IndexOutOfBoundsException");
        }
        try{
            maybeException();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    private static void maybeException () throws SQLException, FileNotFoundException, IOException{

    }
}
