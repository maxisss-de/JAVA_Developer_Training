public class AdministratorImpl extends User implements AdministratorLibrarian, Librarian, Administrator, Everything, Reader, Supplier { // Класс Администратор

    public AdministratorImpl(String name) {
        super(name);
    }

    @Override
    public void notifies(Reader reader) {               // "Уведомлять" от интерфейса Administrator
        System.out.println("Администратор: Уведомляет " + reader + " о времени, что он забыл принести книгу");
    }

    @Override
    public void find(Book book) {                       // "Находит" от интерфейса AdministratorLibrarian
        System.out.println("Администратор: Находит " + book);
    }

    @Override
    public void order(Supplier supplier) {             // "Заказывать" от интерфейса Librarian
        System.out.println("Администратор: Заказывает у " + supplier);
    }

    @Override
    public void bring(Administrator administrator) {  // "Приносить" от интерфейса Supplier
        //  TODO
    }

    @Override
    public void read(Book book) {                     // "Читать" от интерфейса Reader
    }

    @Override
    public void take(Librarian librarian) {          // "Брать" от интерфейса Reader
        System.out.println("Администратор: Берёт у " + librarian);
    }

    @Override
    public void give(Book book) {                   // "Дать, Давать" от интерфейса Everything
        System.out.println("Администратор: Даёт " + book);
    }
}
