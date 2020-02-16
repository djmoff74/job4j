package ru.job4j.tracker;

import java.util.function.Consumer;

/**
 * Class DeleteAction
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String id = input.askStr("Enter Id: ");
        boolean check = tracker.delete(id);
        if (check) {
            output.accept("Item ID :" + id + " was deleted.");
        } else {
            output.accept("Item ID :" + id + " not found.");
        }
        return true;
    }
}
