package ru.job4j.tracker;

/**
 * Class StubAction
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class StubAction implements UserAction {
    private boolean call = false;
    @Override
    public String name() {
        return "Stub action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }
}
