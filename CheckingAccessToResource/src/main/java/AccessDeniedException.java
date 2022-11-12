public class AccessDeniedException extends Exception {
    public AccessDeniedException(String message) {
        super(message);
    }
}

// Это исключение будем использовать, если пользователю меньше 18 лет
