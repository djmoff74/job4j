package ru.job4j.stragery;

/**
 * Class Triangle
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("  +  ");
        pic.append(" + + ");
        pic.append("+++++");
        return pic.toString();
    }
}
