package arrays;

public class Pix implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of $"+amount+" made with Pix");
    }
}
