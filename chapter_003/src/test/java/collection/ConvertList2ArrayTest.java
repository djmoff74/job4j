package collection;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static collection.ConvertList2Array.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class ConvertList2ArrayTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 20.01.2020
 */
public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        int[][] result = toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }
}
