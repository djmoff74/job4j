package ru.job4j.inheritance;

/**
 * Class JSONReport
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 08.01.2020
 */
public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "{" + "\n"
                + "name : " + name + "\n"
                + "body : " + body + "\n"
                + "}";
    }
}
