package ru.job4j.array;

public class FindLoop {
    public int inddexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i <= data.length -1; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
