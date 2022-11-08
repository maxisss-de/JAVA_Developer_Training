public class Main {

    public static void main(String[] args) {

    Author author = new Author("Мария","Эрих",1956,"Germany");

    Book book = new Book("Чтец", 300, 2007);

    User user = new User("gross@mail.com","Кристи","Шведер", book, author);

    book.date(author);
    System.out.println(user.toString());
   }
}
