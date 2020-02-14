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

        public void init() {
            MenuTracker menu = new MenuTracker(this.input, this.tracker, output);
            boolean run = true;
            while (run) {
                menu.showMenu();
                int select = input.askInt("Select: ", menu.getActions().size());
                UserAction action = menu.getActions().get(select);
                run = action.execute(input, tracker);
            }
        }

        public static void main(String[]args) {
            new StartUI(new ValidateInput(new ConsoleInput()), new Tracker(), System.out::println).init();
        }

}

