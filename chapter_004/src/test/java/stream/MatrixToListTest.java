package stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class MatrixToListTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/16/2020
 */
public class MatrixToListTest {

    @Test
    public void convertToList() {
            Integer[][] numbers = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            List<Integer> result = MatrixToList.convertToList(numbers);
            List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
            assertThat(result, is(expected));
    }
}