package POO.Polimorfismo;

public class DevFlix {
    public static void main(String[]args){
        Movie movie = new Movie("Harry Potter");
        movie.play();
        movie.play("English");
        movie.play("Portuguese","English");
    }
}
