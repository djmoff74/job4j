package collection;

import org.junit.Test;

import java.util.Comparator;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

/**
 * Class JobDescByNameReverseTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/2/2020
 */
public class JobDescByNameReverseTest {

    @Test
    public void reversed() {
        Comparator<Job> comparator = new JobDescByNameReverse();
        int rsl = comparator.compare(
                new Job("Fix bug", 2),
                new Job("X task", 3)
        );
        assertThat(rsl, greaterThan(0));
    }


}