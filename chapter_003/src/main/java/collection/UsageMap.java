package collection;

import java.util.HashMap;

/**
 * Class UsageMap
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 24.01.2020
 */
public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("djmoff74@gmail.com", "Eduard Lykov");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
