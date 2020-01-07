package ru.job4j.condition;

public class Point {

    /**
     * поле объекта. доступно только конкретному объекту
     */
    private int x;

    /**
     * поле объекта. доступно только конкретному объекту
     */
    private  int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public double distance(Point that) {
                return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2));
        }

        public static void main(String[] args) {
            Point a = new Point(2, 11);
            Point b = new Point(9, 14);
            double dist = a.distance(b);
            System.out.println(dist);
        }
}
