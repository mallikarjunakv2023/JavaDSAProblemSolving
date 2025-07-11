package perfectPractice2025.challengeDaily;

import java.util.HashMap;
import java.util.Map;

public class FirstPaintedRowCol {

    public int firstCompleteIndex1(int[] arr, int[][] mat) {
        int[] map = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            map[arr[i]] = i;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < mat.length; i++) {
            int max = 0;
            for (int j = 0; j < mat[i].length; j++) {
                max = Math.max(max, map[mat[i][j]]);
            }
            ans = Math.min(ans, max);
        }
        for (int i = 0; i < mat[0].length; i++) {
            int max = 0;
            for (int j = 0; j < mat.length; j++) {
                max = Math.max(max, map[mat[j][i]]);
            }
            ans = Math.min(ans, max);
        }
        return ans;
    }



    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int numRows = mat.length, numCols = mat[0].length;
        Map<Integer, Pair<Integer, Integer>> numToPos = new HashMap<>();
        // Populate the numToPos map by iterating over the matrix
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                int value = mat[row][col];
                numToPos.put(value, new Pair(row, col));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            Pair<Integer, Integer> pos = numToPos.get(num);
            int row = pos.getKey();
            int col = pos.getValue();
            mat[row][col] = -mat[row][col]; // mark as seen

            // Check if the row or column is completely painted
            if (checkRow(row, mat) || checkColumn(col, mat)) {
                return i;
            }
        }

        return -1; // This line will never be reached as per the problem statement
    }

    private boolean checkRow(int row, int[][] mat) {
        // Return true if row is completely seen
        for (int col = 0; col < mat[0].length; col++) {
            if (mat[row][col] > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumn(int col, int[][] mat) {
        // Return true if col is completely seen
        for (int row = 0; row < mat.length; row++) {
            if (mat[row][col] > 0) {
                return false;
            }
        }
        return true;
    }
}
