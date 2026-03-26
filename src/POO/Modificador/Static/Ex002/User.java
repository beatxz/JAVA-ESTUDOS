package POO.Modificador.Static.Ex002;

public class User {
    private String name;
    static int totalUsers = 0;

    public User(String name) {
        this.name = name;
        totalUsers++;

    }
    public static void showTotalUsers() {
        System.out.println("The total number of users is "+totalUsers);
    }

}
