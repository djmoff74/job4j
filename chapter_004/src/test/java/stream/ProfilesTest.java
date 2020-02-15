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
    private List<Profile> list;
    private List<Address> addressList;
    private Profiles profile;

    @Before
    public void fillAddressList() {
        profile = new Profiles();
        addressList = List.of(
        new Address("Chelyabinsk", "Kirova", 19, 2),
        new Address("Chita", "Pobedy", 1, 150),
        new Address("Poltava", "Lenina", 46, 70),
        new Address("Miass", "Shosseynaya", 11, 5),
        new Address("Chita", "Pobedy", 1, 150));
    }
    @Before
    public void fillList() {
        list = addressList.stream().map(Profile::new).collect(Collectors.toList());
    }

    @Test
    public void collect() {
        List<Address> result = profile.collect(list);
        assertThat(result, is(addressList));
    }

    @Test
    public void whenUnigueAddress() {
        List<Address> result = profile.collectUnique(addressList);
        List<Address> expected = List.of(
                new Address("Chelyabinsk", "Kirova", 19, 2),
                new Address("Chita", "Pobedy", 1, 150),
                new Address("Poltava", "Lenina", 46, 70),
                new Address("Miass", "Shosseynaya", 11, 5)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenUnigueAndSortedByCity() {
        List<Address> result = profile.collectUnique(addressList);
        profile.sorted(result);
        List<Address> expected = List.of(
                new Address("Chelyabinsk", "Kirova", 19, 2),
                new Address("Chita", "Pobedy", 1, 150),
                new Address("Miass", "Shosseynaya", 11, 5),
                new Address("Poltava", "Lenina", 46, 70)

        );
        assertThat(result, is(expected));
    }
}