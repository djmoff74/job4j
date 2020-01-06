package ru.jobj.tracker.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return eng;
    }

    public static void main(String[] args) {
        DummyDic newWord = new DummyDic();
        String s = newWord.engToRus("Hello");
        System.out.println("Неизвестное слово. " + s);
    }
}
