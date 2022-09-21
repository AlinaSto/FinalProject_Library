package Library_comparator;

public class Library {
    Book[] bookslist;

    public Library(Book[] bookslist) {
        this.bookslist = bookslist;
    }

    public Book[] getBookslist() {
        return bookslist;
    }

    public void setBookslist(Book[] bookslist) {
        this.bookslist = bookslist;
    }

    public void orderBooksAfterYear() {
        for (Book book : bookslist) {
            System.out.println(book.getYear());
        }


    }
}
