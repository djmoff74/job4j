package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = false;
        for (int i = 1; i <= finish; i++){
            if (finish % i == 0 && i == finish){
                prime = true;
                }
            if(finish % i == 0 && i < finish && i > 1){
                prime = false;
                break;
            }

        }
        return prime;
    }
}
