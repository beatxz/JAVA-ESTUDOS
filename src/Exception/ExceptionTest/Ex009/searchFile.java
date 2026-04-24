package Exception.ExceptionTest.Ex009;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class searchFile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                try {
                    System.out.println("Enter file name: ");
                    String name = scanner.nextLine();

                    try (BufferedReader br = new BufferedReader(new FileReader(name))) {

                        String line;

                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                    }

                    break;

                } catch (IOException e) {
                    System.out.println("File not found. Try again.");
                }
            }
        }
    }
}
