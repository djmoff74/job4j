package ru.job4j.tracker;

import java.util.function.Consumer;

/**
 * Class CreateAction
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class CreateAction implements UserAction {

    @Override
    public String name() {
        return "Create a new Item.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
