package ru.job4j.loop;

public class Factorial {
    public static int calk (int n) {
        int result = 0;
        for (int i = 0; i <= n; i++){
            if (i == 0 || result == 0){
                result = 1;
                i = 1;
            }
            result = result * i;
        }
        return result;
    }
}
