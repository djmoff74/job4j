package ru.job4j.array;

/**
 * Class Defragment sorts an array
 * @author Lykov
 * @version 1.0
 * @since 03.01.2020
 */

public class Defragment {
    /**
     * Method compress move empty elements to end
     * @param array
     * @return sorted massive
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int count = index;
                while (count < array.length - 1) {
                    if (array[count + 1] != null) {
                        array[index] = array[count + 1];
                        array[count + 1] = null;
                        break;
                    }
                    count++;
                }
                System.out.print(array[index] + " ");
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}
