package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ItemSorterByNameTest {
    @Test
    public void testCompare() {
        List<Item> items = Arrays.asList(
                new Item(7, "BBB"),
                new Item(5, "AAA"),
                new Item(1, "CCC")
        );
        Collections.sort(items, new ItemSorterByName());
        assertThat(items.get(0).getName(), is("AAA"));
    }
}