package ru.job4j.poly;

/**
 * Class Bus
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 12.01.2020
 */
public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Let's move on");
    }

    @Override
    public void people(int passengers) {
        System.out.println("we have passengers " + passengers);
    }

    @Override
    public double cost(int fuel) {
        int summ = 500;
        return summ / fuel;
    }
}
