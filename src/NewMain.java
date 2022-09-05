public class NewMain {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");
        Book WarAndPeac = new Book("WarAndPeac", new Author("Lev", "Tolstoy"), 1863);
        Author author1 = new Author("Kathy", "Sierra");
        Book HFJava = new Book("HFJava", author1, 2005);
        System.out.println(WarAndPeac.getPublicationYear());
        WarAndPeac.setYearPublisher(1865);
        System.out.println(WarAndPeac.getPublicationYear());
        System.out.println(WarAndPeac.getTitle()+" "+WarAndPeac.getPublicationYear()+" "+author.getFirstName()+" "+author.getLastName());
        System.out.println(WarAndPeac);
        System.out.println(WarAndPeac.equals(HFJava));
        System.out.println(WarAndPeac.hashCode() == HFJava.hashCode());
    }
}