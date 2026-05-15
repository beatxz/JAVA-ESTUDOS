package Wrapper.Ex0011;

import java.util.Scanner;

public class ScannerTest0 {
    public static void main(String[] args) {
        String data = "Maria,19,false,Pedro,25,true";
        Scanner scanner = new Scanner(data);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean: "+b);
            }else if(scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int: "+i);
            }else{
                String s = scanner.next();
                System.out.println("String: "+s);
            }
        }
    }
}