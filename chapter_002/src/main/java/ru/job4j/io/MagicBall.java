package ru.job4j.io;

import java.util.*;

/**
 * Class MagicBall
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 11.01.2020
 */
public class MagicBall {
    @SuppressWarnings("checkstyle:EmptyBlock")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        String out;
        if (answer == 0) {
            out = "Да.";
        } else if (answer == 1) {
            out = "Нет.";
        } else {
            out = "Может Быть";
        }

        System.out.println("Ответ на Ваш вопрос : " + out);

    }

}
