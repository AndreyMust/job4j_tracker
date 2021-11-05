package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String name =  input.askStr("Enter name: ");
        int id =  input.askInt("Enter id: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item edit success");
        } else {
            System.out.println("System error");
        }
        return true;
    }
}
