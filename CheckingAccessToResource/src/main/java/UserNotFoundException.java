public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message) {
        super(message);
    }
}

// Это исключение будем использовать, если пользователь ввел неверный логин или пароль:
