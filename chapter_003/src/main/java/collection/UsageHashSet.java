package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Class UsageHashSet
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 20.01.2020
 */
public class UsageHashSet {
    public static void main(String[] args) {
        Set<String> autos = Set.of("Lada", "BMW", "Volvo", "Toyota");
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}