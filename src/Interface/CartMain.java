package Interface;

public class CartMain {
    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.addProduct(new Product("bean",15.90,16));
        cart.addProduct(new Product("cheap",12.90,18));
        cart.addProduct(new Product("corn",2.90,40));

        double total = cart.totalCart();

        System.out.println("Cart total: $" + total);

        PaymentMethod pix = new Pixx();
        PaymentMethod card = new CreditCardd();

        System.out.println("\nPix payment: $" + pix.calculatePayment(total));
        System.out.println("Card payment: $" + card.calculatePayment(total));
    }
}

