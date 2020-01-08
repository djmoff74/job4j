package ru.job4j.inheritance;

/**
 * Class TextReport
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 08.01.2020
 */
public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
