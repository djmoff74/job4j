package ru.job4j.ex;

import java.util.Arrays;

/**
 * Class BackArray
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class BackArray {
        public static void main(String[] args) {
            String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
            int middle = names.length / 2;
            for (int index = 0; index <= middle; index++) {
                String temp = names[index];
                names[index] = names[names.length - (1 + index)];
                names[names.length - (1 + index)] = temp;
            }
            System.out.println(Arrays.toString(names));
        }

}
