package ArrayProblems;

public class FindMaxElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 23, 5, 6, 7}, {34, 45, 67, 78}, {3, 6, 98, 43, 12}};
        System.out.println(findMax(arr));
    }

    static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        if (arr.length == 0) {
            return max;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
