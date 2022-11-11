public class Main {

    public static void main(String[] args) {
        AdministratorImpl tom = new  AdministratorImpl("Том");
        ReaderImpl jerry = new ReaderImpl("Джерри");

        Book book1 = new Book("Томас Манн", "Как подружиться с котом");
        Book book2 = new Book("Иоганн Вольфганг фон Гёте", "Если дружба не получлось, как от кота избавиться");

        tom.find(book2);
        tom.give(book2);
        tom.notifies(jerry);
        jerry.give(book1);
    }
}
