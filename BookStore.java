package Library_comparator;

import java.util.*;
import java.util.stream.Collectors;

public class BookStore {
    private Set<Book> books;

    public BookStore(Set<Book> books) {
        this.books = books;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "books=" + books +
                '}';
    }

    public void addBook(Book book) {
        //todo Metoda1

        for (Book b : books) {
            if (!b.equals(book)) {
                books.add(book);
            } else {
                new Book(0, "", "", "");
            }
        }
        //todo Metoda2
        // books.add(getBook);


    }

    public void deleteBook(Book bookParam) {
//        for (Book b : books) {
//            if (b.equals(book)) {
//                books.remove(book);
//            } else {
//                System.out.println("cannot be found");
//            }
//        }
        //todo Metoda2
        books.removeIf(book -> book.equals(bookParam));
        System.out.println(books);


    }

    //todo Metoda1
    public List<Book> getAllBooksOrderedByYear() {
//        List<Book> booksOrderedByYear = new ArrayList<>();
//        booksOrderedByYear.addAll(books);
//        Collections.sort(booksOrderedByYear);
//        return booksOrderedByYear;

        //todo Metoda2
        List<Book> booksOrderedByYear = books.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());
        return booksOrderedByYear;
    }

    public Set<Genre> getAllGenre() {
//        Set<String> genre = new HashSet<>();
//        for (Book book : books) {
//            genre.add(book.getGenre());
//        }
//        return genre;

//todo UNFINISHED

        //todo Metoda2
        Set<String> genre = books.stream()
                .map(book -> book.getGenre())
                //.distinct() //am incercat cu un forEach dar nu am mai reusit sa i facv return
                .collect(Collectors.toSet());

        return null;
    }


    public Set<Book> getAllBooksOrderedByAuthor() {
//        Set<Book> booksOrderedByAuthor = new TreeSet<>(new AuthorComparator());
//        booksOrderedByAuthor.addAll(books);
//        return booksOrderedByAuthor;
        //todo Metoda2
        Set<Book> booksOrderedByAuthor = books.stream()
                .sorted((o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor()))
                .collect(Collectors.toSet());
        return booksOrderedByAuthor;
    }


    public Map<Genre, Set<Book>> getAllBooksByGenre() {
        Map<Genre, Set<Book>> map1 = new HashMap<>();
        for (Book book : books) {
            if (!map1.containsKey(book.getGenre())) {
                Set<Book> keyBook = new HashSet<>();
                keyBook.add(book);
            //    map1.put(book.getGenre(), keyBook);
            } else {
                map1.get(book.getGenre()).add(book);
            }

        }
        return map1;

        //todo Metoda2
//        Set<Book> keyBook = new HashSet<>();
//        Map<Genre, Set<Book>> map = books.stream()
//                .collect(Collectors.groupingBy(book -> book.getGenre());
//        return map;
    }


    public Set<Book> getBooksByGenre(String genre) {
        Map<Genre, Set<Book>> map = getAllBooksByGenre();
        Set<Book> keyBook = new HashSet<>();
        if (map.containsKey(genre)) {
            keyBook = map.get(genre);
        }

        return keyBook;
    }
}