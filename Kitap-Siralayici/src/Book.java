public class Book implements Comparable<Book> {

    String name;
    int pageCount;
    String authorName;
    String publishDate;

    public Book(String name, int pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + " Page Count: " + this.pageCount;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
}
