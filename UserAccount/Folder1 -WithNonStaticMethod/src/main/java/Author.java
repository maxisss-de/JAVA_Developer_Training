public class Author {

    public String name;
    public String surname;
    public int birthday;
    public String country;

    public Author(String name, String surname, int birthday, String country) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.country = country;
    }

    public void names(Book book, User user) {
        if (name.equals(user.name)) {
            System.out.println("Это " + name + " один и тот же автор этой книги: " + book.author);
        } else {
            System.out.println("Книга: " + book.author + " - клиент не автор этой книги");
        }
    }
}
