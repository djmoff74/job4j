package ru.job4j.tracker;

/**
 * Class Input
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 12.01.2020
 */
public interface Input {
    String askStr(String question);

    int askInt(String question);

    int askInt(String question, int max);
}
