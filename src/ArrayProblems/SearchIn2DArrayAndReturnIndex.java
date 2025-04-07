package ArrayProblems;

import java.util.Arrays;

public class SearchIn2DArrayAndReturnIndex {
    public static void main(String[] args) {
        int[][] arr = {{1, 23, 5, 6, 7}, {34, 45, 67, 78}, {3, 6, 98, 43, 12}};
        int target = 34;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
