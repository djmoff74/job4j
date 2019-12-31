package ru.job4j.condition;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class PointTest {
    @Test
    public void distance() {
        double result = Point.distance(2, 11, 9, 14);
        double out = 7.615773105863909;
        Assert.assertEquals(result, out, 0.01);
            }
}
