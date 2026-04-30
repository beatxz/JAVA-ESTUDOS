package Exception.ExceptionTest.Ex017;

import java.io.BufferedReader;
import java.io.FileReader;

public class Numbers {
    public static void main(String[]args) {

            double number = loadNumber();
            System.out.println("Result: "+(number*2));

    }

        public static double loadNumber() {
            try (BufferedReader br = new BufferedReader(new FileReader("numbers.txt"))) {
                String line = br.readLine();
                return Double.parseDouble(line);
            } catch (Exception e) {
                return 0;
            }
        }

}
