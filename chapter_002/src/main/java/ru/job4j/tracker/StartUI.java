package ru.job4j.tracker;


/**
 * Class StartUI
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 11.01.2020
 */
public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askInt("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
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
                String id = input.askStr("Enter Id: ");
                String newName = input.askStr("Enter new name: ");
                Item item = new Item(newName);
                boolean check = tracker.replace(id, item);
                if (check) {
                    System.out.println("Item ID :" + id + " was edited.");
                } else {
                    System.out.println("Item ID :" + id + " not found.");
                }

            } else if (select == 3) {
                System.out.println("Delete item");
                String id = input.askStr("Enter Id: ");
                boolean check = tracker.delete(id);
                if (check) {
                    System.out.println("Item ID :" + id + " was deleted.");
                } else {
                    System.out.println("Item ID :" + id + " not found.");
                }

            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                String id = input.askStr("Enter Id: ");
                Item result = tracker.findById(id);
                if (result != null) {
                    System.out.println("ID: " + tracker.findById(id).getId() + "    " + "Name: " + tracker.findById(id).getName());
                } else {
                    System.out.println("Item not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                String name = input.askStr("Enter name: ");
                Item[] result = tracker.findByName(name);
                System.out.println("=== Items found by name:  ====");
                if (result.length > 0) {
                    for (Item item : result) {
                        System.out.println("ID: " + item.getId() + "   Name: " + item.getName());
                    }
                } else {
                    System.out.println("Item , " + name + " not found");
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
        Input input = new ConsoleInput() {
        };
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
