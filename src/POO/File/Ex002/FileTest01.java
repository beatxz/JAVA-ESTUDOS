package POO.File.Ex002;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("/home/bea/Área de Trabalho/java/novo-project/src/filet.txt");
        try {
            boolean isDeleted = file.delete();
//            boolean isCreated = file.createNewFile();
            System.out.println("Is Deleted");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
