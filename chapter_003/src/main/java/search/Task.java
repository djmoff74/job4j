package search;

/**
 * Class Task
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 20.01.2020
 */
public class Task {
    private String desc;
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}
