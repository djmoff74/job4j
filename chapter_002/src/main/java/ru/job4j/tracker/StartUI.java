package ru.job4j.tracker;

import java.util.*;
/**
 * Class StartUI
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 11.01.2020
 */
public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] result = tracker.findAll();
                System.out.println("All items: ");
                for (Item item : result) {
                    System.out.println(item.getId() + " " + item.getName());
                }
            } else if (select == 2) {
                System.out.println("Edit item");
                System.out.print("Enter Id: ");
                String id = scanner.nextLine();
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                Item item = new Item(newName);
                tracker.replace(id, item);
                System.out.println("=== Item was edited ====");
            } else if (select == 3) {
                System.out.println("Delete item");
                System.out.print("Enter Id: ");
                String name = scanner.nextLine();
                tracker.delete(name);
                System.out.println("=== Item was deleted ====");
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter Id: ");
                String id = scanner.nextLine();
                Item result = tracker.findById(id);
                if (result != null) {
                    System.out.println("ID: " + tracker.findById(id).getId() + "    " + "Name: " + tracker.findById(id).getName());
                } else {
                    System.out.println("Item not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] result = tracker.findByName(name);
                System.out.println("=== Items found by name:  ====");
                if (result != null) {
                    for (Item item : result) {
                        System.out.println("ID: " + item.getId() + "   Name: " + item.getName());
                    }
                } else {
                    System.out.println("Item not found");
                }

            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        // добавить остальные пункты меню.
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}