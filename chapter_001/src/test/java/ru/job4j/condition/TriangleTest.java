package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;



public class TriangleTest {
    @Test
    public void whenAreaTriangleTrue() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        Point c = new Point(5, 0);
        Triangle triangle = new Triangle(a, b, c);
        double out = triangle.area();
        double expected = 10.99;
        Assert.assertEquals(expected, out, 0.01);
    }
}
