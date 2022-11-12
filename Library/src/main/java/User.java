public class User implements Administrator, Librarian, Reader, Supplier {  // Класс Пользователь

    public String name;

    public User(String name) {
        this.name = name;
    }

    public void setName() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void notifies(Reader reader) {

    }

    @Override
    public void order(Supplier supplier) {

    }

    @Override
    public void read(Book book) {

    }

    @Override
    public void take(Librarian librarian) {

    }

    @Override
    public void bring(Administrator administrator) {

    }

    public String toString() {
        return name;
    }
}
