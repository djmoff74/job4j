package ru.job4j.oop;

public class Jukebox {
    public void musics(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox petya = new Jukebox();
        petya.musics(1);
        petya.musics(2);
        petya.musics(3);
    }
}
