package Static;

import java.util.HashSet;
import java.util.Set;

public class BookSeller {
    static Set<Book> books = new HashSet<>();

    static void sellBooks(Book b1, Book b2){
        books.add(b1);
        books.add(b2);
        for (Book book : books) System.out.println(book.name);
    }

    public static void main(String[] args) {
        sellBooks(new Book("b1", "b1", "b1", "b1", "b1"),
                new Book("b2", "b2", "b2", "b2", "b2"));
    }

    static class Book{
        String id;
        String isbn;
        String name;
        String author;
        String publishDate;
        public Book(String id, String isbn, String name, String author, String publishDate){
            this.id = id;
            this.isbn = isbn;
            this.name = name;
            this.author = author;
            this.publishDate = publishDate;
        }
    }
}
