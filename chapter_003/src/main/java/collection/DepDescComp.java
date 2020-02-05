package collection;

import java.util.Comparator;

/**
 * Class DepDescComp
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/5/2020
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = o1.length() - o2.length();
        int length = Math.min(o1.length(), o2.length());

        for (int i = 0; i < length; i++) {
            int charCompare = Character.compare(o2.charAt(i), o1.charAt(i));
            if (charCompare != 0) {
                result = charCompare;
                break;
            }
        }
        return result;
    }
}
