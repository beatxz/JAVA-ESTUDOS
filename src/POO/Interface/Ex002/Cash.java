package POO.Interface.Ex002;

public class Cash implements PaymentOrder {

    @Override
    public double pay(double amount) {
        return amount*0.95;
    }
}
