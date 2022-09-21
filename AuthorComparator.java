package Library_comparator;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return String.valueOf(o1.getAuthor()).compareTo(o2.getAuthor());
    }
}
