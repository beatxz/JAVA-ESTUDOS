package POO.Interface;

public class CreditCard implements Payment {
    @Override
    public void pay(double value) {
        System.out.println("Payment of U$" + value+" made with credit card");
    }
}
