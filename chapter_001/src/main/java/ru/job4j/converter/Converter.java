package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
       // return -1;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int rub = 140;
        int expected = 2;
        int out = rubleToEuro(rub);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int rub1 = 120;
        int expected1 = 2;
        int out1 = rubleToDollar(rub1);
        boolean passed1 = expected1 == out1;
        System.out.println("120 rubles are 2. Test result : " + passed1);
        int dollar = rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollars.");
        int eur = 3;
        int expected2 = 210;
        int out2 = euroToRuble(eur);
        boolean passed2 = expected2 == out2;
        System.out.println("3 euro are 210. Test result : " + passed2);
        int ruble = euroToRuble(3);
        System.out.println("3 euro are " + ruble + " rubles.");
        int usd = 5;
        int expected3 = 300;
        int out3 = dollarToRuble(usd);
        boolean passed3 = expected3 == out3;
        System.out.println("5 dollars are 300. Test result : " + passed3);
        int ruble1 = dollarToRuble(5);
        System.out.println("5 dollars are " + ruble1 + " rubles.");
    }
}
