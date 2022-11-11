public class LibrarianImpl extends User implements Librarian, Everything, AdministratorLibrarian, Reader, Supplier { // Класс Библиотекарь

    public LibrarianImpl(String name) {
        super(name);
    }

    @Override
    public void order(Supplier supplier) {            // "Заказывать" от интерфейса Librarian
        System.out.println("Библиотекарь: Заказывает у " + supplier);
    }

    @Override
    public void bring(Administrator administrator) {  // "Приносить" от интерфейса Supplier
        //  TODO
    }

    @Override
    public void read(Book book) {                   // "Приносить" от интерфейса Reader

    }

    @Override
    public void take(Librarian librarian) {         // "Брать" от интерфейса Reader
        System.out.println("Библиотекарь: Берёт");
    }

    @Override
    public void give(Book book) {                   // "Дать, Давать" от интерфейса Everything
        System.out.println("Библиотекарь: Даёт " + book);
    }

    @Override
    public void find(Book book) {                   // "Находит" от интерфейса AdministratorLibrarian
        System.out.println("Библиотекарь: Находит " + book);
    }
}
