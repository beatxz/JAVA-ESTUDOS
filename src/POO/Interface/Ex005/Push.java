package POO.Interface.Ex005;

public class Push implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Push notification: "+message);
    }
}
