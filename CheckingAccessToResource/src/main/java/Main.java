import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {  // В нем нужно запросить логин и пароль пользователя, проверить есть ли данная пара "логин и пароль" в массиве пользователей и последним шагом провалидировать возраст.
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите логин");
            String login = scanner.nextLine();
            System.out.println("Введите пароль");
            String password = scanner.nextLine();
            if ("end".equals(login) && "end".equals(password)) {
                break;
            }
            User user = getUserByLoginAndPassword(login, password);
            validateUser(user);
            System.out.println("Доступ предоставлен!");
            System.out.println("Нажмите Enter для продолжения или Enter и end два раза, чтобы закончить программу");
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Программа завершена!");

    }

    public static User[] getUsers() {           // этот метод должен возвращать список заранее созданных пользователей:
        User user1 = new User("Дон", "Don111", "1234D", "don@mail.com", 18);
        User user2 = new User("Мики", "Mili_May", "M4321", "miki@gmail.de", 17);
        User user3 = new User("Коля", "Kolya_tik-tok", "111KKK", "kolya@mail.ru", 27);
        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {  // в этом методе нужно найти соответствие пары логина и пароля пользователя из массива, возвращаемого методом getUsers. Если пользователь не найден, выбрасываем исключение UserNotFoundException, если найден - возвращаем найденного пользователя:
        User[] users = getUsers();
        for (User user : users) {
            if (password.equals(user.getPassword()) && login.equals(user.getLogin())) {
                return user;
            }
        }
        throw new UserNotFoundException("Нет такого пользователя!");
    }

    public static void validateUser(User user) throws AccessDeniedException {   // метод для проверки возрастра пользователя. Если возраст менее 18 лет, метод должен выбросить исключение AccessDeniedException
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Доступ запрещен, ограничение по возрасту +18!");
        }
    }
}
