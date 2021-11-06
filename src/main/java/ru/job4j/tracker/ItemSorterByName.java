package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ItemSorterByName implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }

    public static void main(String[] args) {
        Item item1 = new Item(3, "AAA");
        Item item2 = new Item(2, "BBB");
        Item item3 = new Item(1, "CCC");
        List<Item> items = Arrays.asList(item1, item2, item3);
        Collections.sort(items);
        System.out.println(items);
    }
}
