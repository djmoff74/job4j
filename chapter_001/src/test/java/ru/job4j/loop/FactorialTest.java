package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void Factorial0To5() {
        int result = Factorial.calk(5);
        assertThat(result, is(120));
    }

    @Test
    public void Factorial0() {
        int result = Factorial.calk(0);
        assertThat(result, is(1));
    }
}
