package POO.Polimorfismo.Repository.Ex001;

public class repositoryMemory implements Repository{
    @Override
    public void save() {
        System.out.println("Saving memory...");

    }
}
