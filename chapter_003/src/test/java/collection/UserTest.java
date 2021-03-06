package collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class UserTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 1/29/2020
 */
public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = Set.of(
        new User("Petr", 32),
        new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareNameAreEqual() {
        Set<User> users = Set.of(
        new User("Petr", 32),
        new User("Petr", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Petr", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

}