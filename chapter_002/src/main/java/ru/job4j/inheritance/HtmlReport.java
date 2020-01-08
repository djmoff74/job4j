package ru.job4j.inheritance;

/**
 * Class HtmlReport
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 08.01.2020
 */
public class HtmlReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>" + System.lineSeparator() + "<br/>" + System.lineSeparator() + "<span>" + body + "</span>";
    }
}
