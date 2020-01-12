package ru.job4j.tracker;

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
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
