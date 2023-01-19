import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        OrderByName nameOrder = new OrderByName();
        OrderByPageCount pageCountOrder = new OrderByPageCount();

        TreeSet<Book> hashSetName = new TreeSet<>(nameOrder);
        TreeSet<Book> hashSetPageCount = new TreeSet<>(pageCountOrder);

        Book book1 = new Book("a", 5);
        Book book2 = new Book("b", 4);
        Book book3 = new Book("c", 3);
        Book book4 = new Book("d", 2);
        Book book5 = new Book("e", 1);

        hashSetName.add(book1);
        hashSetName.add(book2);
        hashSetName.add(book3);
        hashSetName.add(book4);
        hashSetName.add(book5);

        hashSetPageCount.add(book1);
        hashSetPageCount.add(book2);
        hashSetPageCount.add(book3);
        hashSetPageCount.add(book4);
        hashSetPageCount.add(book5);

        System.out.println("Sorting by the book name.");
        for (Book b : hashSetName) {
            System.out.println(b);
        }

        System.out.println();

        System.out.println("Sorting by the page count.");
        for (Book b1 : hashSetPageCount) {
            System.out.println(b1);
        }
    }
}