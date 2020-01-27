package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

/**
 * Class SortIncreaseByItemIdTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 1/27/2020
 */
public class SortIncreaseByItemIdTest {

    @Test
    public void compare() {
        Item item1 = new Item("bug1");
        Item item2 = new Item("bug1");
        Item item3 = new Item("bug1");
        Item item4 = new Item("bug1");
        item1.setId("45265874");
        item2.setId("4569455487");
        item3.setId("1256");
        item4.setId("-56987");
        List<Item> items = Arrays.asList(item1, item2, item3, item4);
        List<Item> expected = Arrays.asList(item4, item3, item1, item2);
        Collections.sort(items, new SortIncreaseByItemId());
        assertThat(expected, is(items));
    }
}