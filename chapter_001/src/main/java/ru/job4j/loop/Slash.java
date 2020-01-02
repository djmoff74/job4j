package ru.job4j.loop;

/**
 * Class Slach рисуем крест в псевдографике.
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 02.01.2020
 */

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = cell == row;
                boolean right = cell == (size - (row + 1));
                if (left || right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
