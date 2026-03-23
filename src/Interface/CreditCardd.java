package Interface;

public class CreditCardd implements PaymentMethod{
    @Override
        public double calculatePayment(double amount) {
            return amount * 1.05;
    }
}
