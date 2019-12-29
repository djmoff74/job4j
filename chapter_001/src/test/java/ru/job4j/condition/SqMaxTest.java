package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {
    @Test
    public void whenMax() {
        SqMax check = new SqMax();
        int result = check.max(2, 1, 2, 1);
        assertThat(result, is(2));
    }
}