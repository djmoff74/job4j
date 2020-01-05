package ru.job4j.array;

/**
 * Class EndsWith
 * @author Lykov
 * @version 1.0
 * @since 03.01.2020
 */
public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (post[post.length - (1 + i)] != word[word.length - (1 + i)]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
