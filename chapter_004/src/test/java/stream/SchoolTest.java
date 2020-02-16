package stream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class SchoolTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/15/2020
 */
public class SchoolTest {
    private List<Student> students = new ArrayList<>();
    private School school;

    @Before
    public void addStudent() {
        school = new School();
        students.add(new Student("Pupkin", 75));
        students.add(new Student("Petrov", 100));
        students.add(new Student("Sidorov", 15));
        students.add(new Student("Ivanov", 45));
        students.add(new Student("Pavlov", 80));
        students.add(new Student("Morozov", 65));
        students.add(new Student("Vasilcov", 35));
        students.add(new Student("Romanov", 50));
        students.add(new Student("Vasilcov", 20));
    }

    @Test
    public void collect0To50In10V() {
        List<Student> result = school.collect(students, s -> s.getScore() > 0 && s.getScore() < 50);
        List<Student> expected = List.of(
                new Student("Sidorov", 15),
                new Student("Ivanov", 45),
                new Student("Vasilcov", 35),
                new Student("Vasilcov", 20));
        assertThat(result, is(expected));
    }

    @Test
    public void collect50To70In10B() {
        List<Student> result = school.collect(students, s -> s.getScore() >= 50 && s.getScore() < 70);
        List<Student> expected = List.of(
                new Student("Morozov", 65),
                new Student("Romanov", 50));
        assertThat(result, is(expected));
    }

    @Test
    public void collect70To100In10A() {
        List<Student> result = school.collect(students, s -> s.getScore() >= 70 && s.getScore() <= 100);
        List<Student> expected = List.of(
                new Student("Pupkin", 75),
                new Student("Petrov", 100),
                new Student("Pavlov", 80));
        assertThat(result, is(expected));
    }

    @Test
    public void whenListToMap() {
        Map<String, Student> map = school.collectListToMap(students);
        List<String> expected = List.of("Pupkin", "Petrov", "Sidorov", "Ivanov", "Pavlov", "Morozov", "Vasilcov", "Romanov");
        boolean result = true;
        for (String s : expected) {
            if (!map.containsKey(s)) {
                result = false;
                break;
            }
        }
        assertTrue(result && expected.size() == map.size());
    }

}