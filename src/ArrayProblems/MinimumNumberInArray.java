package ArrayProblems;

public class MinimumNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 13, 15, 19};
        System.out.println(minNumberInArray(arr));
    }

    static int minNumberInArray(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
