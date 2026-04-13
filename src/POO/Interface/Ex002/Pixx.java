package POO.Interface.Ex002;

import POO.Interface.Ex001.PaymentMethod;

public class Pixx implements PaymentMethod {
    @Override
    public double calculatePayment(double amount) {
        return amount * 0.9;
    }

}