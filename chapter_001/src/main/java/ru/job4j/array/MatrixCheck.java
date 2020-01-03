package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int out = 0; out < board.length; out++) {
                if (board[out][row - 1] == 'X') {
                    for (row = 0; row < board.length; row++) {
                        if (board[out][row] != 'X') {
                            result = false;
                            break;

                        }
                    }
                }
            }
        return result;
    }
}
