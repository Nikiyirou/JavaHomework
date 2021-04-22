package Static;

import java.util.HashSet;
import java.util.Set;

public class p1 {
    private static Set<Book> books = new HashSet<>();

    static{
        books.add(new Book("3335", "4532", "book1", "author1", "03042011"));
        books.add(new Book("3374", "4892", "book2", "author2", "03012011"));
        books.add(new Book("3824", "9092", "book3", "author3", "07012018"));
    }
}

class Book{
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