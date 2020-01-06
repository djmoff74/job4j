package ru.job4j.calculator;

import java.util.Arrays;

/**
 * Class Anagrams
 * @author Lykov
 * @version 1.0
 * @since 03.01.2020
 */
public class Anagramms {
    public static void find(String[] words) {
        boolean[] analyzed = new boolean[ words.length ];
        Arrays.fill(analyzed, false);
        for (int i = 0; i < words.length; i++) {
            if (!analyzed[i]) {
                analyzed[i] = true;
                System.out.print(words[i] + " [ ");
                char[] first = words[i].toCharArray();
                Arrays.sort(first);
                for (int j = 0; j < words.length; j++) {
                    if ((i != j) && !analyzed[j]) {
                        char[] second = words[j].toCharArray();
                        Arrays.sort(second);
                        if (Arrays.equals(first, second)) {
                            analyzed[j] = true;
                            System.out.print(words[j] + " ");
                        }
                    }
                }
                System.out.println("]");
            }
        }
    }
    public static void main(String[] args) {
        find(new String[]{"mama", "amam", "amm", "amma"});
    }
}