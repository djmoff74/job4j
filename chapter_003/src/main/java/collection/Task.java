package collection;

/**
 * Class Task
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 20.01.2020
 */
public class Task {
    private String number;
    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }
}
