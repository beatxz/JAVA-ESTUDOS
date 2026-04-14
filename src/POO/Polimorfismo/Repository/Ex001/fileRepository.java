package POO.Polimorfismo.Repository.Ex001;

public class fileRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving file...");

    }
}
