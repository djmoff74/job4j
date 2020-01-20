package collection;

import java.util.HashSet;
import java.util.List;

/**
 * Class FullSearch
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 20.01.2020
 */
public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        // for-each
        for (Task num : list) {
            if (!numbers.equals(num.getNumber())) {
                numbers.add(num.getNumber());
            }
        }
        return numbers;
    }
}
