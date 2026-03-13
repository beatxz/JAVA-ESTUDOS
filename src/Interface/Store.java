package Interface;

public class Store {
    public static void main(String[] args) {
        Payment card = new CreditCard();
        Payment pix = new Pix();

        pix.pay(50);
        card.pay(100);
    }
}
