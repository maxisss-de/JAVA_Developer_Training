package com.company;

public class Book {

    public static String author;
    public static int pages;
    public static int year;

    public static void date() {
        if (year == Author.birthday) {
            System.out.println("Она написала эту книгу: " + author + " как только появилась на свет");
        } else {
            System.out.println("Эта книга: " + author + " написано в 21 веке");
        }
    }
}
