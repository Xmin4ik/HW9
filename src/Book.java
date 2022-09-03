public class Book {
    private String nameBook;
    private String authorName;
    private int yearPublisher;

    public Book(String nameBook, String authorName, int yearPublisher) {
        this.nameBook = nameBook;
        this.authorName = authorName;
        this.yearPublisher = yearPublisher;
    }

    public int getYearPublisher() {
        return this.yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public String getAuthorName() {
        return this.authorName;
    }
}
