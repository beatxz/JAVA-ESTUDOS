package Interface;

public class CreditCardOrder implements PaymentOrder {
    @Override
    public double pay (double amount){
        return amount*1.05;
    }
}
