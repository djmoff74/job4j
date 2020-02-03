package collection;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class StringCompareTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/3/2020
 */
public class StringCompareTest {

        @Test
        public void whenStringsAreEqualThenZero() {
            StringCompare compare = new StringCompare();
            int rst = compare.compare(
                    "Ivanov",
                    "Ivanov"
            );
            assertThat(rst, is(0));
        }

        @Test
        public void whenLeftLessThanRightResultShouldBeNegative() {
            StringCompare compare = new StringCompare();
            int rst = compare.compare(
                    "Ivanov",
                    "Ivanova"
            );
            assertThat(rst, lessThan(0));
        }

        @Test
        public void whenLeftGreaterThanRightResultShouldBePositive() {
            StringCompare compare = new StringCompare();
            int rst = compare.compare(
                    "Petrov",
                    "Ivanova"
            );
            assertThat(rst, greaterThan(0));
        }

        @Test
        public void secondCharOfLeftGreaterThanRightShouldBePositive() {
            StringCompare compare = new StringCompare();
            int rst = compare.compare(
                    "Petrov",
                    "Patrov"
            );
            assertThat(rst, greaterThan(0));
        }

        @Test
        public void secondCharOfLeftLessThanRightShouldBeNegative() {
            StringCompare compare = new StringCompare();
            int rst = compare.compare(
                    "Patrova",
                    "Petrov"
            );
            assertThat(rst, lessThan(0));
        }

    @Test
    public void whenRightEmptyThenShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                ""
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void whenLeftEmptyThenShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "",
                "Petrov"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenEqualAndLeftEndsWithSpacesThenShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov  ",
                "Ivanov"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void whenEqualAndLeftStartsWithSpacesAndRirhtEndsWithSpacesThenShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "  Ivanov",
                "Ivanov  "
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenNotUppercase() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "ivanov",
                "IVANOV  "
        );
        assertThat(rst, greaterThan(0));
    }
}