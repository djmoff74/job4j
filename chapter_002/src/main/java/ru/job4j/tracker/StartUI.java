package ru.job4j.tracker;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Class StartUI
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 11.01.2020
 */
public class StartUI {
    private final Input input;
    private final Tracker tracker;
    private final Consumer<String> output;

    public StartUI(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }

    public void init(List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        output.accept("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            output.accept(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        List<UserAction> actions = new ArrayList<>();
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
                actions.add(new CreateAction());
                actions.add(new ShowAction());
                actions.add(new ReplaceAction());
                actions.add(new DeleteAction());
                actions.add(new FindByIdAction());
                actions.add(new FindByNameAction());
                actions.add(new ExitAction());
        new StartUI(validate, tracker, System.out::println).init(actions);
    }
}
