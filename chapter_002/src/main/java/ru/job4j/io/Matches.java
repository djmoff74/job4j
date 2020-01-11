package ru.job4j.io;

import java.util.*;

/**
 * Class Matches
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 11.01.2020
 */
public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        System.out.println("\"Игра 11\"");
        while (matches > 0) {
            System.out.println("На столе сейчас " + matches + " Спичек.");
            System.out.println("Игрок 1 : введите число от 1 до 3");
            int player1 = Integer.valueOf(input.nextLine());
            matches = matches - player1;
            if (matches <= 0) {
                System.out.println("Победил Игрок 1");
                break;
            }

            System.out.println("На столе сейчас " + matches + " Спичек.");
            System.out.println("Игрок 2 : введите число от 1 до 3");
            int player2 = Integer.valueOf(input.nextLine());
            matches = matches - player2;
            if (matches <= 0) {
                System.out.println("Победил Игрок 2");
            }

        }
    }
}
