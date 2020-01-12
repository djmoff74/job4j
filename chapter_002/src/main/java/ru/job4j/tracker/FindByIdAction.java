package ru.job4j.tracker;

/**
 * Class FindByIdAction
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by Id.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter Id: ");
        Item result = tracker.findById(id);
        if (result != null) {
            System.out.println("ID: " + tracker.findById(id).getId() + "    " + "Name: " + tracker.findById(id).getName());
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
