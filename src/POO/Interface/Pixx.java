package POO.Interface;

public class Pixx implements PaymentMethod {
    @Override
    public double calculatePayment(double amount) {
        return amount * 0.9;
    }

}