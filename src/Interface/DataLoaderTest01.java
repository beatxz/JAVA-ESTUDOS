package Interface;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader databaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}

