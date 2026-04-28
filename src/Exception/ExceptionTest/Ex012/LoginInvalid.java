package Exception.ExceptionTest.Ex012;

public class LoginInvalid extends Exception {
    public LoginInvalid() {
        super("Invalid login");
    }

    public LoginInvalid(String message) {
        super(message);
    }
}
