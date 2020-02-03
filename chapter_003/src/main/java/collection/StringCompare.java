package collection;

import java.util.Comparator;

/**
 * Class StringCompare
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/3/2020
 */
public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int result = left.length() - right.length();
        int length = Math.min(left.length(), right.length());
        for (int i = 0; i < length; i++) {
            int charCompare = Character.compare(left.charAt(i), right.charAt(i));
            if (charCompare != 0) {
                result = charCompare;
                break;
            }
        }
        return result;
    }
}
