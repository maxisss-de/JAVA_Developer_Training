public class SupplierImpl extends User implements Supplier, Everything, Librarian {  // Класс Поставщик

    public SupplierImpl(String name) {
        super(name);
    }

    @Override
    public void order(Supplier supplier) {             // "Заказывать" от интерфейса Librarian
        //  TODO
    }

    @Override
    public void bring(Administrator administrator) {  // "Приносить" от интерфейса Supplier
        System.out.println("Поставщик: Приносит ");
    }


    @Override
    public void give(Book book) {                     // "Дать" от интерфейса Everything
        System.out.println("Поставщик: Даёт " + book);
    }
}
