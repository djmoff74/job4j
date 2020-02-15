package stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class ProfilesTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/15/2020
 */
public class ProfilesTest {
    private List<Profile> list = new ArrayList<>();

    @Before
    public void fillList() {
        list.add(new Profile(new Address("Chelyabinsk", "Kirova", 19, 2)));
        list.add(new Profile(new Address("Chita", "Pobedy", 1, 150)));
        list.add(new Profile(new Address("Poltava", "Lenina", 46, 70)));
        list.add(new Profile(new Address("Miass", "Shosseynaya", 11, 5)));
    }

    @Test
    public void collect() {
        List<Address> result = list.stream().map(Profile::getAddress).collect(Collectors.toList());
        List<Address> expected = List.of(
                new Address("Chelyabinsk", "Kirova", 19, 2),
                new Address("Chita", "Pobedy", 1, 150),
                new Address("Poltava", "Lenina", 46, 70),
                new Address("Miass", "Shosseynaya", 11, 5));
        assertThat(result, is(expected));


    }
}