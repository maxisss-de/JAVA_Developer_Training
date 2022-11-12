public class User {

    private String name;
    private String login;
    private String password;
    private String email;
    private int age;

    public User (String name, String login, String password, String email, int age) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}
