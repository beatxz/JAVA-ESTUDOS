package Exception.ExceptionTest.Ex018;
import java.io.BufferedReader;
import java.io.FileReader;

public class Numbers {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("numbers.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                try {
                    double number = Double.parseDouble(line);
                    System.out.println("Valid number: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number");
                }
            }

        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}
