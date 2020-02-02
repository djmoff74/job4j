package collection;

import java.util.Comparator;

/**
 * Class JobDescByNameReverse
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/2/2020
 */
public class JobDescByNameReverse implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
