package ru.job4j.poly;

/**
 * Class Transport
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 12.01.2020
 */
public interface Transport {
    void go();

    void people(int passengers);

    double cost(int fuel);
}
