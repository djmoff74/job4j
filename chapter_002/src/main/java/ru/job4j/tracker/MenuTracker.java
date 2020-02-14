package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.function.Consumer;
/**
 * Class MenuTracker
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/14/2020
 */
public class MenuTracker {
    private final Input input;
    private final Tracker tracker;
    private final Consumer<String> output;
    private ArrayList<UserAction> actions = new ArrayList<>();

    public MenuTracker(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;

        actions.add(new CreateAction());
        actions.add(new ShowAction());
        actions.add(new ReplaceAction());
        actions.add(new DeleteAction());
        actions.add(new FindByIdAction());
        actions.add(new FindByNameAction());
        actions.add(new ExitAction());
    }

    public ArrayList<UserAction> getActions() {
        return actions;
    }

    public void showMenu() {
        output.accept("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            output.accept(index + ". " + actions.get(index).name());
        }
    }
}
