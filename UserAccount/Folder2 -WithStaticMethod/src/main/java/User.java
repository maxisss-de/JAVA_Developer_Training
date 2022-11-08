package com.company;

public class User {

    public static String email;
    public static String name;
    public static String surname;

    public String toString() {
        return "Имя: " + name + ", Фамилия: " + surname + ", эл. почта:" + email + ", она читает книгу: "
                + Book.author + " автор этой книги: " + Author.name + " " + Author.surname;
    }
}
