package heranca;

public class LibraryMain {
    public static void main(String[]args){
        Library library = new Library();

        library.addBook(new Book("little prince","Camilla",200));
        library.addBook(new Book("Battle Royal","Isabela",600));
        library.addBook(new Book("The Lord of the Rings","Noah",300));
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
        System.out.println("Total number of books added to the library: "+library.totalBooks());

    }
}
