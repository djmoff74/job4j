package collection;

import java.util.HashMap;
import java.util.List;
/**
 * Class OrderConvert
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 25.01.2020
 */
public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
/*Внутри метода process нужно пройти по всем элементам списка orders и вставить их в map.
Чтобы пройти по элементам orders используйте цикл for-earch. Чтобы вставить данные в map используйте метод map.put. Первый параметр будет номер, а второй заявка.
 */