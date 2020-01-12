package ru.job4j.stragery;

/**
 * Class Square
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class Square implements Shape {
    @Override
    public String draw() {
        String s = System.lineSeparator();
        StringBuilder pic = new StringBuilder();
        pic.append("+++++++").append(s);
        pic.append("+     +").append(s);
        pic.append("+     +").append(s);
        pic.append("+++++++");
        return pic.toString();
    }
}
