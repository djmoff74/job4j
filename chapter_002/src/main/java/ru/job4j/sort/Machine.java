package ru.job4j.sort;

import java.util.Arrays;

/**
 * Class Machine
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class Machine {
    private static final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int summChange = (money - price);
        for (int coin : COINS) {
            while ((summChange - coin) >= 0) {
                rsl[size] = coin;
                summChange = summChange - coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
