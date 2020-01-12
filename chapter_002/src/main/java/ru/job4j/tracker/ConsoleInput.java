package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Class ConsoleInput
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 12.01.2020
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}
