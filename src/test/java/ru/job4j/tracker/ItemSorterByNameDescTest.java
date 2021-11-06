package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemSorterByNameDescTest {
    @Test
    public void testCompare() {
        List<Item> items = Arrays.asList(
                new Item(7, "BBB"),
                new Item(5, "AAA"),
                new Item(1, "CCC")
        );
        Collections.sort(items, new ItemSorterByNameDesc());
        assertThat(items.get(0).getName(), is("CCC"));
    }
}
