package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class Student
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/15/2020
 */
public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream().
                flatMap(Stream::ofNullable).
                sorted().
                takeWhile(student -> student.getScore() > bound).
                collect(Collectors.toList());

    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", score=" + score
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.getScore(), this.getScore());
    }
}
