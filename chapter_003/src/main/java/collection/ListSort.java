package collection;

import java.util.*;
/**
 * Class ListSort
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 26.01.2020
 */
public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
