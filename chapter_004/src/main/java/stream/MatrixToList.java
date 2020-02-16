package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class MatrixToList
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/16/2020
 */
public class MatrixToList {
    public static List<Integer> convertToList(Integer[][] matrix) {
        return Stream.of(matrix).flatMap(Stream::of).collect(Collectors.toList());
    }
}
