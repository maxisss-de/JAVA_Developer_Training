package com.company;

public class Author {

    public static String name;
    public static String surname;
    public static int birthday;
    public static String country;

    public static void names() {
        if (name.equals(User.name)) {
            System.out.println("Это " + name + " один и тот же автор этой книги: " + Book.author);
        } else {
            System.out.println("Книга: " + Book.author + " - клиент не автор этой книги");
        }
    }
}
