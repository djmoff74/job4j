package ru.job4j.tracker;

import java.util.function.Consumer;

/**
 * Class UserAction
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker, Consumer<String> output);
}
