package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int out = 0; out < size; out++) {
            for (int in = 0; in < size; in++) {
                table[out][in] = (out + 1) * (in + 1);
            }

        }
        return table;
    }
}
