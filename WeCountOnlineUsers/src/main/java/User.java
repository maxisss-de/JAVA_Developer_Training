public class User {

    public static int totalOnline = 0;

    public String email;
    public String name;
    public String surname;

    public User(String email, String name, String surname) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        totalOnline++;
    }

    public static int counter() {
        return totalOnline;
    }
}
