package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ===");
        String name =  input.askStr("Enter name: ");
        int id =  input.askInt("Enter id: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Item edit success");
        } else {
            out.println("System error");
        }
        return true;
    }
}
