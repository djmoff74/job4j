package ru.job4j.stragery;

/**
 * Class Paint
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}


/*
Задание.

        1. Нам необходимо продемонстрировать создание шаблона стратегия на примере реализации доски
        для рисования и загрузки в них форм.
        2. Создать классы Paint, Triangle, Square, интерфейс Shape. в пакете ru.job4j.stragery;
        3. В интерфейсе Shape объявить метод String draw(). Метод draw() должен возвращать фигуру в виде строки;
        4. Реализовать интерфейс Shape для квадрата (Square), треугольника (Triangle);
        5. В классе Paint реализовать метод public void draw(Shape shape).
        Метод draw() должен печатать псевдокартинку на консоль через метод System.out.println(shape.draw())
        6. Написать 2 тест-метода для квадрата и треугольника.
        7. Нет ограничений в реализации алгоритмов прорисовки - вы можете прорисовывать полые квадраты,
         заполненные или даже заготовленную строку.*/
