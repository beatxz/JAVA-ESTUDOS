package arrays;

public class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of $"+amount+" made with credit card");
    }
}
