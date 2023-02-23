import java.util.Comparator;

public class OrderByPageCount implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.pageCount - o2.pageCount;
    }
}
