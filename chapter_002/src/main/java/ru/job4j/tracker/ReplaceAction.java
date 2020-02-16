package ru.job4j.tracker;

import java.util.function.Consumer;

/**
 * Class ReplaceAction
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class ReplaceAction implements UserAction {

    private final Consumer<String> output = s -> {
    };

    @Override
    public String name() {
        return "Edit item.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String id = input.askStr("Enter Id: ");
        String newName = input.askStr("Enter new name: ");
        Item item = new Item(newName);
        boolean check = tracker.replace(id, item);
        if (check) {
            output.accept("Item ID :" + id + " was edited.");
        } else {
            output.accept("Item ID :" + id + " not found.");
        }
        return true;
    }
}
