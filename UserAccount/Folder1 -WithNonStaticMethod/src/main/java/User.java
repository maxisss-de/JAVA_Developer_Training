public class User {

    public String email;
    public String name;
    public String surname;
    public Book book;
    public Author author;
  
    public User(String email, String name, String surname, Book book, Author author) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.book = book;
        this.author = author;
    }

    public String toString() {
        return "Имя: " + name + ", Фамилия: " + surname + ", эл. почта:" + email + ", она читает книгу: "
                + book.author + " автор этой книги: " + author.name + " " + author.surname;
    }
}
