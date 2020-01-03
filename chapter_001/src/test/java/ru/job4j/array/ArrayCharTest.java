package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result =ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }

    @Test
    public void whenStartWithPrefixMeThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'M', 'e'};
        boolean result =ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }

    @Test
    public void whenStartWithPrefixHeloThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'l', 'o'};
        boolean result =ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }

    @Test
    public void whenStartWithPrefixHelloThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'l', 'l', 'o'};
        boolean result =ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }
}
