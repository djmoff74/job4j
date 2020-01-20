package collection;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Class UniqueText
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 21.01.2020
 */
public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>(Arrays.asList(origin));
        for (String cell : text) {
            if (!check.contains(cell)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}