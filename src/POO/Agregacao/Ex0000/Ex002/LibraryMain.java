package POO.Agregacao.Ex0000.Ex002;

public class LibraryMain {
    public static void main(String[]args){
        Library books = new Library();
        books.addBook(new Book("You and i","Isabela",200));
        books.addBook(new Book("Harry potter","Beatrice",900));
        books.addBook(new Book("Bettle Royal","Donna",200));
        for(Book book : books.getBooks()){
            System.out.println(book);
        }
        System.out.println("Number of books in the library: "+books.totalBooks());
    }
}
