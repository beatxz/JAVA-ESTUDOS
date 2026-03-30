package POO.Constante.Ex001;

public class Login {
    private static final int MINIMUM_PASSWORD_SIZE = 10;
    public void  verifyPassword(String password) {
        if (password.length() >= MINIMUM_PASSWORD_SIZE) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
