package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[data.length - (1 + i)])  {
                result = false;
                break;
            }
        }
        return result;
    }
}
