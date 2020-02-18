package collection;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;

/**
 * Class DepartmentsTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/5/2020
 */
public class DepartmentsTest {

    @Test
    public void whenMissed() {
        List<String> input = List.of("k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = List.of("k1", "k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenTwoDepart() {
        List<String> input = List.of("K1/SK1/SSK1", "K2/SK1/SSK1");
        List<String> expect = List.of("K1", "K1/SK1", "K1/SK1/SSK1", "K2", "K2/SK1", "K2/SK1/SSK1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenTwoDepartReverse() {
        List<String> input = List.of("K1/SK1/SSK1", "K2/SK1/SSK1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        List<String> expect = List.of("K2", "K2/SK1", "K2/SK1/SSK1", "K1", "K1/SK1", "K1/SK1/SSK1");
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortReverse() {
        List<String> input = List.of("k2/sk1", "k2");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        List<String> expect = List.of("k2", "k2/sk1");
        assertThat(result, is(expect));
    }

}