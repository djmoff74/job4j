package ru.job4j.array;

/**
 * Class ArrayChar
 * @author Lykov
 * @version 1.0
 * @since 03.01.2020
 */
public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
