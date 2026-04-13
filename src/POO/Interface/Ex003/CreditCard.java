package POO.Interface.Ex003;

public class CreditCard implements Payment {
    @Override
    public void pay(double value) {
        System.out.println("Payment of U$" + value+" made with credit card");
    }
}
