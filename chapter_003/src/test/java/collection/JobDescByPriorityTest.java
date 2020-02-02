package collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

/**
 * Class JobDescByPriorityTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/2/2020
 */
public class JobDescByPriorityTest {

    @Test
    public void whenCompareByPriority() {
        Comparator<Job> comparator = new JobDescByPriority();
        int rsl = comparator.compare(
                new Job("Fix bug", 2),
                new Job("X task", 3)
        );
        assertThat(rsl, lessThan(0));
    }
}