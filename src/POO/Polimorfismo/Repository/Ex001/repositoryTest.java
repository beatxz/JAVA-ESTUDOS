package POO.Polimorfismo.Repository.Ex001;

public class repositoryTest {
    public static void main(String[] args) {
        Repository repository = new fileRepository();
        repository.save();
        Repository repository2 = new repositoryDatabase();
        repository2.save();
        Repository repository3 = new repositoryMemory();
        repository3.save();
    }
}
