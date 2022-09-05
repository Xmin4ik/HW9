public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setYearPublisher(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

}
