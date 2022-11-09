public class Main {

    public static void main(String[] args) {

        User user1 = new User("pety_ivanov@mail.ru", "Петя", "Иванов");
        User user2 = new User("schmit_alika@gmail.de", "Алика", "Шмидт");
        User user3 = new User("jackie_robinson@gmail.com", "Джеки", "Робинсон");
        System.out.println(User.totalOnline);
    }
}
