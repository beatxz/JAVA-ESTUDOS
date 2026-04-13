package POO.Interface.Ex001;

public class CreditCardd implements PaymentMethod {
    @Override
        public double calculatePayment(double amount) {
            return amount * 1.05;
    }
}
