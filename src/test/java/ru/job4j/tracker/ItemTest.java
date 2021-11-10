package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ItemTest {
    @Test
    public void testCompareTo() {
        List<Item> items = Arrays.asList(
                new Item(2, "AAA"),
                new Item(3, "BBB"),
                new Item(1, "CCC")
        );
        Collections.sort(items);
        assertThat(items.get(0).getName(), is("CCC"));
    }

    @Test
    public void compareToUp() {
        List<Item> items = Arrays.asList(
                new Item(3, "Gamma"),
                new Item(4, "Foxy"),
                new Item(1, "Alpha"),
                new Item(2, "Beta")
        );
        List<Item> expected = Arrays.asList(
                new Item(1, "Alpha"),
                new Item(2, "Beta"),
                new Item(3, "Gamma"),
                new Item(4, "Foxy")
        );
        Collections.sort(items);
        assertThat(items, is(expected));
    }

    @Test
    public void compareUpByName() {
        List<Item> items = Arrays.asList(
                new Item(3, "Cetta"),
                new Item(4, "Delta"),
                new Item(1, "Alpha"),
                new Item(2, "Bravo")
        );
        List<Item> expected = Arrays.asList(
                new Item(1, "Alpha"),
                new Item(2, "Bravo"),
                new Item(3, "Cetta"),
                new Item(4, "Delta")
        );
        Collections.sort(items, new ItemSorterByName());
        assertThat(items, is(expected));
    }

    @Test
    public void compareUpByNameDesc() {
        List<Item> items = Arrays.asList(
                new Item(3, "Cetta"),
                new Item(4, "Delta"),
                new Item(1, "Alpha"),
                new Item(2, "Bravo")
        );
        List<Item> expected = Arrays.asList(
                new Item(4, "Delta"),
                new Item(3, "Cetta"),
                new Item(2, "Bravo"),
                new Item(1, "Alpha")
        );
        Collections.sort(items, new ItemSorterByNameDesc());
        assertThat(items, is(expected));
    }
}