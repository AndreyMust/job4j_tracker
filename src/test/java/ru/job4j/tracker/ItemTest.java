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

}