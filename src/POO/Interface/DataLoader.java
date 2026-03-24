package POO.Interface;

public interface DataLoader {
    public void load();
    default void checkPermission(){
        System.out.println("Checking permission");
    }
}
