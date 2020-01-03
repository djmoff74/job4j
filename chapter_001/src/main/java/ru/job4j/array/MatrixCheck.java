package ru.job4j.array;

/**
 * Class MatrixCheck
 *
 * @author Lykov
 * @version 1.0
 * @since 03.01.2020
 */

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] != 'X') {
                   result = false;
                   break;
                }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int cell) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int cell = 0; cell != board.length; cell++) {
            int row = cell;
            if (board[row][cell] == 'X') {
                rsl[cell] = board[row][cell];
            }
        }
        return rsl;
    }
}
