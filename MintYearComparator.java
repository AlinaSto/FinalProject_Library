package Library_comparator;

import java.util.Comparator;

public class MintYearComparator implements Comparator<Book>  {
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.valueOf(o1.getYear()).compareTo(Integer.valueOf(o2.getYear()));
    }
}
