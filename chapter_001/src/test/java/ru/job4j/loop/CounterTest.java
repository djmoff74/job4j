package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
     int result = Counter.add(0, 10);
     System.out.println(result);
     assertThat(result, is(30));
    }
}
