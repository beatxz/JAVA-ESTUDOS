package POO.Interface.Ex004;

public interface DataLoader {
    public void load();
    default void checkPermission(){
        System.out.println("Checking permission");
    }
}
