public class ReaderImpl extends User implements Administrator, Everything, Reader, Supplier { // Класс Читатель

    public ReaderImpl(String name) {
        super(name);
    }

    @Override
    public void notifies(Reader reader) {                // "Уведомлять" от интерфейса Administrator +
        //  TODO
    }

    @Override
    public void take(Librarian librarian) {             // "Брать" от интерфейса Reader
        System.out.println("Читатель: Берёт у " + librarian);
    }

    @Override
    public void read(Book book) {                     // "Читать" от интерфейса Reader
        System.out.println("Читатель: Читает " + book);
    }

    @Override
    public void bring(Administrator administrator) { // "Приносить" от интерфейса Supplier
        System.out.println("Читатель: Приносит");
    }

    @Override
    public void give(Book book) {                     // "Дать, Давать" от интерфейса Everything
        System.out.println("Читатель: Отдаёт " + book);
    }
}
