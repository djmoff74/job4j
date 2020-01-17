package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Class ValidateInputTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 13.01.2020
 */
public class ValidateInputTest {
    private final PrintStream def = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput() {
        System.setOut(this.def);
        System.out.println("execute after method");
    }

    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"one", "1"})
        );
        input.askInt("Enter", 6);
        assertThat(
                out.toString(),
                is(String.format("Please enter validate data again.%n"))
        );
    }
    @Test
    public void whenInvalidInputOutOfRange() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"10", "0"})
        );
        input.askInt("Enter", 6);
        assertThat(
                out.toString(),
                is(String.format("Please select key from menu.%n"))
        );
    }
}
