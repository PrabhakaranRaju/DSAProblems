package ArrayProblems;

public class SearchElementInRangeOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 13, 15, 19};
        int target = 1;
        System.out.println(searchInRange(arr, target, 2, 5));
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
