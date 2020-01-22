package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Class FindByNameAction
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find items by name.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> result = tracker.findByName(name);
        if (result.size() > 0) {
            for (Item item : result) {
                System.out.println(item.getId() + " " + item.getName());
            }
        } else {
            System.out.println("Item , " + name + " not found");
        }
        return true;
    }
}
