package ru.job4j.tracker;

import java.util.*;

public class FindByName implements UserAction {
    private final Output out;

    public FindByName(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
            return "Find items by name";
        }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        List<Item> items = tracker.findByName(name);
        if (items.size() > 0) {
            for (Item item : items) {
                    out.println(item);
                }
            } else {
                out.println("Заявки с таким именем не найдены");
            }
            return true;
        }
}
