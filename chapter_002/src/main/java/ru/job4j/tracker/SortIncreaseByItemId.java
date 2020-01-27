package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Class SortIncreaseByItemId
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 1/27/2020
 */
public class SortIncreaseByItemId implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        return a.getId().compareTo(b.getId());
    }
}
