package ru.job4j.calculator;

/**
 * Class  Calculator для вычисления арифметических операций + - / *.
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version $Id$
 * @since 02.01.2020
 */
public class Calculator {
    /**
     * выполняем операцию сложения first и second
     * вывод на консоль результата
     */
    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }
    /**
     * выполняем операцию деления  first на second
     * вывод на консоль результата
     */
    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + "/" + second + " = " + result);
    }
    /**
     * выполняем операцию умножения переременных first на second
     * вывод на консоль результата
     */
    public static void multiple(double first, double second) {
        double result =  first * second;
        System.out.println(first + "*" + second + " = " + result);
    }
    /**
     * выполняем операцию вычитания  second из first
     * вывод на консоль результата
     */
    public static void subtract(double first, double second) {
        double result =  first - second;
        System.out.println(first + "-" + second + " = " + result);
    }


    /**
     * Main
     * @param args - add div multiple subtract.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiple(2, 1);
        subtract(10, 5);


    }
}
