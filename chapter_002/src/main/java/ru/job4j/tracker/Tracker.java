package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;
/**
 * Class Tracker
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 09.01.2020
 */
public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод findAll() возвращает список всех заявок без null элементов (без пустых клеток).
     *
     * @return массив this.items без null элементов
     */
    public Item[] findAll() {
        Item[] result = new Item[position];
        int size = 0;
        for (int i = 0; i < result.length; i++) {
            Item item = this.items[i];
            if (item != null) {
                result[size] = item;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    /**
     * Метод findByName(String key) для получения списка заявок по имени
     *
     * @param key имя заявки
     * @return массив this.items с выборкой по имени заявки
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int size = 0;
        for (int i = 0; i < result.length; i++) {
            Item item = this.items[i];
            if (item.getName().equals(key)) {
                result[size] = item;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    /**
     * Метод indexOf(String id) ищет индекс массива items, в котором объект с данным id
     *
     * @param id идентификатор объекта Item
     * @return индекс массива items
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод findById(String id) для получения заявки по уникальному ключу (id)
     *
     * @param id уникальный ключ заявки
     * @return заявка с искомым id
     */
    public Item findById(String id) {
        Item result = null;
        int index = indexOf(id);
        if (index != -1) {
            result = items[index];
        }
        return result;
    }

    public void replace(String id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(items[index].getId());
            items[index] = item;
        }

    }

}
