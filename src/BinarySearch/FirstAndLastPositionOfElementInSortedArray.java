package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,9,9,10};
        int target = 9;

        int[] ans = {-1, -1};
        int first = binarySearch(arr, target, true);
        int second = binarySearch(arr, target, false);
        ans[0] = first;
        ans[1] = second;
        System.out.println(Arrays.toString(ans));
       // return ans;
    }

    static int binarySearch(int[] arr, int target, boolean firstOccurrence) {
        int ans = -1;
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstOccurrence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
