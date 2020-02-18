package search;

import java.util.LinkedList;

/**
 * Class PriorityQueue
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 20.01.2020
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        var index = 0;
        for (var element : tasks) {
            if (element.getPriority() > task.getPriority()) {
                break;
            } else {
                index++;
            }

        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.remove(0);
    }
}
