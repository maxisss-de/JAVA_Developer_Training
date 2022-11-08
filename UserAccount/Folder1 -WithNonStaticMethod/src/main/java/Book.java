public class Book {

    public String author;
    public int pages;
    public int year;

    public Book(String author, int pages, int year) {
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public void date(Author author) {
        if (year == author.birthday) {
            System.out.println("Она написала эту книгу: " + this.author + " как только появилась на свет");
            } else {
            System.out.println("Эта книга: " + this.author + " написано в 21 веке");
        }
    }
}
