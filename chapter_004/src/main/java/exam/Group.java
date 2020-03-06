package exam;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Class Group
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 3/6/2020
 */
public class Group {
    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getUnits().stream()
                .map(group -> new Holder(group, student.getName())))
                .collect(Collectors.groupingBy(t -> t.key,
                        Collector.of(HashSet::new,
                                (set, el) -> set.add(el.value),
                                (left, right) -> {
                                left.addAll(right);
                                return left;
                        }))
                );
    }

    static class Holder {
        String key, value;

        Holder(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
