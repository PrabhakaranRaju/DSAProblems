package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 9;
        System.out.println(binarySearch(arr, 0, arr.length - 1, target));
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
