public class Main {

    public static void main(String[] args) {
        //Книги
        Book HFJava = new Book("HFJava", "Kathy Sierra", 2003);
        System.out.println("HFJava.getNameBook() = " + HFJava.getNameBook());
        System.out.println("HFJava.getAuthorName() = " + HFJava.getAuthorName());
        System.out.println("HFJava.getYearPublisher() = " + HFJava.getYearPublisher());
        Book WarAndPeace = new Book("WarAndPeace", "Lev Tolstoy", 1863);
        System.out.println("WarAndPeace.getNameBook() = " + WarAndPeace.getNameBook());
        System.out.println("WarAndPeace.getAuthorName() = " + WarAndPeace.getAuthorName());
        System.out.println("WarAndPeace.getYearPublisher() = " + WarAndPeace.getYearPublisher());
        WarAndPeace.setYearPublisher(1873);
        System.out.println("WarAndPeace.getYearPublisher() = " + WarAndPeace.getYearPublisher());
        // Авторы
        Author LevTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("LevTolstoy.getFirstName() = " + LevTolstoy.getFirstName());
        System.out.println("LevTolstoy.getLastName() = " + LevTolstoy.getLastName());

        Author KathySierra = new Author("Kathy", "Sierra");
        System.out.println("KathySierra.getFirstName() = " + KathySierra.getFirstName());
        System.out.println("KathySierra.getLastName() = " + KathySierra.getLastName());
        // А дальше я не могу понять что делать) . Помогите пожайлуста (ಥ﹏ಥ). Специально до зумма отправаляю

    }


}