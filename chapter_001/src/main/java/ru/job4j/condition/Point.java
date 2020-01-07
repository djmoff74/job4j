package ru.job4j.condition;

public class Point {

    /**
     * поле объекта. доступно только конкретному объекту
     */
    private final int x;

    /**
     * поле объекта. доступно только конкретному объекту
     */
    private final int y;

    /**
     * поле объекта. доступно только конкретному объекту
     */
    private int z;

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     *
     * @param first  координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     *
     * @param x координата x
     * @param y координата y
     * @param z координата z
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Метод distance подсчетывает расстояние между двумя точками
     * @param that объект точки для вычисления
     * @return double расстояние
     */
    public double distance(Point that) {
       return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2));
    }

    /**
     * Метод distance3d подсчетывает расстояние между двумя точками в трех мерном пространстве
     * @param that объект точки для вычисления
     * @return double расстояние
     */
    public double distance3d(Point that) {
       return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2)
                + Math.pow((this.z - that.z), 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}
