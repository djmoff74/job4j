package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    private final List<Item> items = new ArrayList<>();

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
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
    public List<Item> findAll() {
        return  this.items;
    }

    /**
     * Метод findByName(String name) для получения списка заявок по имени
     *
     * @param name имя заявки
     * @return массив this.items с выборкой по имени заявки
     */
    public List<Item> findByName(String name) {
        List<Item> result = new ArrayList<>();
        int size = 0;
        for (Item item : this.items) {
            if (item.getName().equals(name)) {
                result.add(item);
            }
        }
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
        for (int index = 0; index < this.items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
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
        if (indexOf(id) != -1) {
            result = items.get(indexOf(id));
        }
        return result;
    }

    public boolean replace(String id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(items.get(index).getId());
            items.set(indexOf(id), item);
            return true;
        }
        return rsl;
    }

    public boolean delete(String id) {
        boolean rsl = false;
        int distPos = indexOf(id);
        if (distPos != -1) {
            this.items.remove(distPos);
            return true;
        }
        return rsl;
    }
}