package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int i = 0; i <= (array.length -1) / 2; i++) {
            int tmp = array[array.length - (1 + i)];
            array[array.length - (1 + i)] = array[i];
            array[i] = tmp;
        }
        return array;
    }
}
