package Exception.ExceptionTest.Ex014;
import javax.swing.*;
import java.io.IOException;

public class App {
    public static void main(String[]args) throws Exception {

        String filePath = "/home/bea/Área de Trabalho/java/novo-project/src/Exception/ExceptionTest/Ex014/User.txtt";
        File file = new File();
        try{
            String result = file.reader(filePath);
            System.out.println(result);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"There was a problem reading the file.");

        }




    }
}
