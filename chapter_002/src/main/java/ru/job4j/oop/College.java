package ru.job4j.oop;

/**
 * Class College
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 12.01.2020
 */
public class College {
    public static void main(String[] args) {
//        создаем обьект класса Freshman
        Freshman freshman = new Freshman();
//        делаем приведение к типу родителя Student
        Student student = freshman;
//        делаем приведение к типу родителя Object
        Object object = freshman;
    }
}
