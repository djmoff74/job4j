package ru.job4j.tracker;

/**
 * Class StubInput
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 12.01.2020
 */
public class StubInput implements Input {
    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
