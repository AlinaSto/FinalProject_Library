package Library_comparator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MainBook {
    public static void main(String[] args) {
        Book book = new Book(2015, "Bezna", "Horror", "Abdullaev C.");
        Book book1 = new Book(2014, "Sculptorul", "Drama", "Aura C.");
        Book book2 = new Book(2009, "O suta si una de poezii", "Dragoste", "Ovidiu G.");

        Set<Book> booksList1 = new HashSet<>();
        booksList1.add(book);
        booksList1.add(book1);
        booksList1.add(book2);
        BookStore bookStore = new BookStore(booksList1);
        System.out.println(booksList1);
//        // Collections.sort(booksList1);
//        // todo sau
//        booksList1.sort(new MintYearComparator());
//        System.out.println(booksList1);
//        booksList1.sort(new AuthorComparator());
//        System.out.println(booksList1);
        System.out.println("---------------------------------------------");
        bookStore.addBook(book);
        bookStore.addBook(book1);
        bookStore.addBook(book2);
        System.out.println(bookStore);
        System.out.println("---------------------------------------------");
        bookStore.deleteBook(book1);
        System.out.println("---------------------------------------------");

        System.out.println(bookStore.getAllBooksOrderedByYear());
        System.out.println("---------------------------------------------");
        System.out.println(bookStore.getAllGenre());
        System.out.println(bookStore.getAllBooksOrderedByAuthor());
     //   System.out.println(bookStore.getAllBooksByGenre());
        System.out.println(bookStore.getBooksByGenre("Horror"));


    }

}
