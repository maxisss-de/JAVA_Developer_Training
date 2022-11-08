package com.company;

public class Main {

    public static void main(String[] args) {

    User user = new User();
    User.email = "gross@mail.com";
    User.name = "Кристи";
    User.surname = "Шведер";

    Author.name = "Мария";
    Author.surname = "Эрих";
    Author.birthday = 1956;
    Author.country = "Germany";

    Book.author = "Чтец";
    Book.pages = 300;
    Book.year = 2007;

    Author.names();
    Book.date();
    System.out.println(user.toString());
    }
}
