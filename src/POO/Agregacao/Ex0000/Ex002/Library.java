package POO.Agregacao.Ex0000.Ex002;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        books.add(book);
    }
    public ArrayList<Book> getBooks(){
        return books;
    }
    public int totalBooks(){
        return books.size();
    }

}
