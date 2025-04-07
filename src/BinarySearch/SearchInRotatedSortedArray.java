package BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 7;
        System.out.println(binarySearch(arr, 0, arr.length - 1, target));
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[start] <= arr[mid]) {
                // left side is sorted
                if (target >= arr[start] && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // Right side is sorted
                if (target >= arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
