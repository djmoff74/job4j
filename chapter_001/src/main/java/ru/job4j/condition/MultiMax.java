package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean ifFirstSecond = first > second;
        System.out.println("результат сравнения first > secong : " + first + " > " + second + " = " + ifFirstSecond);
        int result1 = ifFirstSecond ? first : second;
        System.out.println("наибольшее F или S : " + result1);
        boolean ifSecondThird = result1 > third;
        System.out.println("результат сравнения second > third : " + result1 + " > " + third + " = " + ifSecondThird);
        int result = ifSecondThird ? result1 : third;
        System.out.println("наибольшее S или Th : " + result);
        return result;
    }
}
