package ru.job4j.tracker;

/**
 * Class ReplaceAction
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Edit item.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter Id: ");
        String newName = input.askStr("Enter new name: ");
        Item item = new Item(newName);
        boolean check = tracker.replace(id, item);
        if (check) {
            System.out.println("Item ID :" + id + " was edited.");
        } else {
            System.out.println("Item ID :" + id + " not found.");
        }
        return true;
    }
}
