package Arrays_Hashing;

import java.util.*;

class Valid_Sudoku {
    public boolean validSudoku(char[][] board) {
        Map<Integer, Set<Integer>> colSet = new HashMap<>();
        Map<Integer, Set<Integer>> rowSet = new HashMap<>();
        Map<Map.Entry<Integer, Integer>, Set<Integer>> squareSet = new HashMap<>();

        int sizeSudoku = 9;
        for (int row = 0; row < sizeSudoku; row++) {
            for (int col = 0; col < sizeSudoku; col++) {
                int val = board[row][col] - 48;
                if (val != -2) {
                    // Validate Columns
                    colSet.putIfAbsent(col, new HashSet<>());
                    if (colSet.get(col).contains(val))
                        return false;

                    colSet.get(col).add(val);

                    // Validate Rows
                    rowSet.putIfAbsent(row, new HashSet<>());
                    if (rowSet.get(row).contains(val))
                        return false;

                    rowSet.get(row).add(val);

                    // Validate Squares
                    Map.Entry<Integer, Integer> myPair = new AbstractMap.SimpleEntry<>((int) row / 3, (int) col / 3);
                    squareSet.putIfAbsent(myPair, new HashSet<>());
                    if (squareSet.get(myPair).contains(val))
                        return false;

                    squareSet.get(myPair).add(val);
                }
            }
        }

        return true;
    }
}