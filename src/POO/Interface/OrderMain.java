package POO.Interface;

public class OrderMain {
    public static void main(String[]args) {
        Order item = new Order( );

        item.addItem(new Item("Notbook",3000,3));
        item.addItem(new Item("Book",2000,2));
        item.addItem(new Item("Mouse",200,7));

        System.out.println("Order total: $"+item.totalOrder());

        PaymentOrder cash = new Cash();
        PaymentOrder CreditCard = new CreditCardOrder();

        System.out.println("\nCash payment: $" + cash.pay(item.totalOrder()));
        System.out.println("Credit Card payment: $" + CreditCard.pay(item.totalOrder()));

    }
}
