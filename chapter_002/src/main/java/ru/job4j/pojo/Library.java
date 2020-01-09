package ru.job4j.pojo;

import org.w3c.dom.ls.LSOutput;

/**
 * Class Library
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 09.01.2020
 */
public class Library {
    public static void main(String[] args) {
        Book first = new Book("Java book", 150);
        Book second = new Book("Clean code", 15);
        Book third = new Book("The jungle book", 400);
        Book fourth = new Book("Star wars", 500);

        Book[] books = new Book[4];

        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;

        for (Book item : books) {
            System.out.println(item.getName() + " - " + item.getNumbers());
        }

        System.out.println();
        System.out.println("Moving a book from index 3 to index 0");

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        for (Book item : books) {
            System.out.println(item.getName() + " - " + item.getNumbers());
        }

        System.out.println();
        System.out.println("Filtered by \"Clear code\"");
        for (Book item : books) {
            if (item.getName().equals("Clean code")) {
                System.out.println(item.getName() + " - " + item.getNumbers());
            }
        }
    }
}
