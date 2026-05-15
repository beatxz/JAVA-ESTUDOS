package Wrapper.Ex0011;

public class ScannerTest01 {
    public static void main(String[] args) {

        String text = "Isa, Bea, Fabi";
        String [] names = text.split(",");
        for (String name : names ){
            System.out.println(name.trim());
        }
    }
}

