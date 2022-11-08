public class Book {

    public String bookName;
    public int numberPages;
    public int rating;

    public Book(String bookName, int numberPages, int rating) {
        this.bookName = bookName;
        this.numberPages = numberPages;
        this.rating = rating;
    }

    public void maxNumberPages() {
            if (this.numberPages > 256) {
            System.out.println("Эта книга: " + bookName + " очень популярна, так как в ней больше одного тома");
            } else {
            System.out.println("Эта книга: " + bookName + " не популярна");
        }
    }

    public String toString() {
        return " Эта книга 2021: " + bookName;
    }
}
