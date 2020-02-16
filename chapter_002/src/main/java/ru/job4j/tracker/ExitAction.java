package ru.job4j.tracker;

import java.util.function.Consumer;

/**
 * Class ExitZction
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "Exit Programm.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        return false;
    }
}
