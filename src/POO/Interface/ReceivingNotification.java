package POO.Interface;

public class ReceivingNotification {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification push = new Push();
        Notification sms = new Sms();

        email.send("Your order has been shipped");
        push.send("Your order has been shipped");
        sms.send("Your order has been shipped");
    }
}
