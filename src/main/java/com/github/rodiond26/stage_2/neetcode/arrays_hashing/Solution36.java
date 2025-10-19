package com.github.rodiond26.stage_2.neetcode.arrays_hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution36 {

    public boolean isValidSudoku(char[][] board) {
        int sudokuSize = 9;
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<Integer, Map<Integer, Set<Character>>> squares = new HashMap<>();

        for (int row = 0; row < sudokuSize; row++) {
            for (int column = 0; column < sudokuSize; column++) {
                char value = board[row][column];
                int squareRow = row / 3;
                int squareColumn = column / 3;

                if (value == '.') {
                    continue;
                }
                if (rows.get(row) != null && rows.get(row).contains(value)) {
                    return false;
                }
                if (columns.get(column) != null && columns.get(column).contains(value)) {
                    return false;
                }
                if (squares.get(squareRow) != null
                        && squares.get(squareRow).get(squareColumn) != null
                        && squares.get(squareRow).get(squareColumn).contains(value)) {
                    return false;
                }
                rows.computeIfAbsent(row, k -> new HashSet<>());
                rows.get(row).add(value);
                columns.computeIfAbsent(column, k -> new HashSet<>());
                columns.get(column).add(value);

                squares.computeIfAbsent(squareRow, k -> new HashMap<>());
                squares.get(squareRow).computeIfAbsent(squareColumn, k -> new HashSet<>());
                squares.get(squareRow).get(squareColumn).add(value);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution36 solution = new Solution36();
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        boolean result = solution.isValidSudoku(board);
        System.out.println("result = " + result);
    }
}
