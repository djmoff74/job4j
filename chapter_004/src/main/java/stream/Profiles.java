package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class Profiles
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/15/2020
 */
public class Profiles {
    List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
    }

    class SortByCityAddress implements Comparator<Address> {
        @Override
        public int compare(Address first, Address second) {
            return first.getCity().compareTo(second.getCity());
        }
    }

    List<Address> collectUnique(List<Address> addresses) {
        return addresses.stream().distinct().collect(Collectors.toList());
    }

    void sorted(List<Address> addresses) {
        addresses.sort(new SortByCityAddress());
    }

}
