package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Class SortDecreaseByItemId
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 1/27/2020
 */
public class SortDecreaseByItemId implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        return b.getId().compareTo(a.getId());
    }
}
