public class Main {

    public static void main(String[] args) {

        Author author = new Author("Агатара", "Кристи",35);
        Book book1 = new Book("Как найти сокровище", 200, 5);
        System.out.println("Автор книги: " + author.name + " " + author.surname + " ," + "рейтиг: " + book1.rating);
        book1.maxNumberPages();
        System.out.println(book1.toString());


        Author author2 = new Author("Борис", "Акунин",56);
        Book book2 = new Book("Пираты карибского моря", 250, 7);
        System.out.println("Автор книги: " + author2.name + " " + author.surname + " ," + "рейтиг: " + book2.rating);
        book2.maxNumberPages();
        System.out.println(book2.toString());


        Author author3 = new Author("Иоганн", "Вольфанг фот Гёте",70);
        Book book3 = new Book("Машина времени", 800, 10);
        System.out.println("Автор книги: " + author3.name + " " + author.surname + " ," + "рейтиг: " + book3.rating);
        book3.maxNumberPages();
        System.out.println(book3.toString());
    }
}
