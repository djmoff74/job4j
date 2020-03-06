package exam;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class GroupTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 3/6/2020
 */
public class GroupTest {

    @Test
    public void groupingByInterest() {
        List<Student> students = List.of(
                new Student("Ivanov", Set.of("boxing", "karate")),
                new Student("Petrov", Set.of("boxing", "judo", "chess")),
                new Student("Sidorov", Set.of("chess")),
                new Student("Pupkin", Set.of("boxing", "karate", "judo", "chess"))
        );
        Map<String, Set<String>> result = Group.sections(students);
        Map<String, Set<String>> expected = Map.of(
                "chess", Set.of("Pupkin", "Petrov", "Sidorov"),
                "karate", Set.of("Pupkin", "Ivanov"),
                "judo", Set.of("Pupkin", "Petrov"),
                "boxing", Set.of("Pupkin", "Petrov", "Ivanov")
        );
        assertThat(result, is(expected));
    }
}