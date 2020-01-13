package ru.job4j.tracker;

/**
 * Class ShowAction
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "Show all items.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] result = tracker.findAll();
        for (Item item : result) {
            System.out.println(item.getId() + " " + item.getName());
        }
        return true;
    }
}