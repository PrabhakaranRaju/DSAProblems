package ArrayProblems;

public class MaximumNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 13, 15, 19};
        System.out.println(maxNumberInArray(arr));
    }

    static int maxNumberInArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
