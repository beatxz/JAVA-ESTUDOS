package POO.File.Ex001;

public class App {
    public static void main(String[] args) {

        String filePath = "/home/bea/.../UserTxt";

        FileReaderUtil file = new FileReaderUtil();

        String result = file.read(filePath);

        System.out.println(result);
    }
}