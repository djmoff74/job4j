package search;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class PhoneDictionaryTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 20.01.2020
 */
public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}
