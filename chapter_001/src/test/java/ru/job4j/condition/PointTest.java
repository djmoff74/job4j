package ru.job4j.condition;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(2, 11);
        Point b = new Point(9, 14);
        double expected = 7.61;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
            }
}
