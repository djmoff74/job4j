package collection;

import java.util.List;

/**
 * Class ConvertList2Array
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 20.01.2020
 */
public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            array[row][cell++] = num;
            if (cell == cells) {
                row++;
                cell = 0;
            }
        }
        return array;
    }
}
