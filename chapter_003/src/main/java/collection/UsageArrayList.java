package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Class UsageArrayList
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 20.01.2020
 */
public class UsageArrayList {
    public static void main(String[] args) {
        List<String> names = List.of("Petr", "Ivan", "Stepan");
        for (Object value : names) {
            System.out.println(value);
        }
    }
}
