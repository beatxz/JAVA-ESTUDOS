package POO.Modificador.Static.Ex002;

public class UserMain {
    public static void main(String[] args) {
        new User("Beatriz");
        new User("Isabela");
        new User("Giselle");
        new User("Gigi");

        User.showTotalUsers();


    }
}
