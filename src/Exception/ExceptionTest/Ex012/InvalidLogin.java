package Exception.ExceptionTest.Ex012;

import java.util.Scanner;

public class InvalidLogin {
    public static void main(String[]args){
        try {
            logar();
        }catch (LoginInvalid e){
            e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalid{
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Isabela";
        String passwordDB = "bbi";
        System.out.println("User: ");
        String userName = scanner.nextLine();
        System.out.println("Password: ");
        String userPassword = scanner.nextLine();
        if(!userName.equals(usernameDB)||!userPassword.equals(passwordDB)){
            throw new LoginInvalid("Invalid username or password.");
        }
        System.out.println("User logged in successfully.");
    }
}
