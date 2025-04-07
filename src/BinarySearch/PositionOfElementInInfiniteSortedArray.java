package BinarySearch;

public class PositionOfElementInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 42, 33, 5, 6};
        int target = 5;
        System.out.println(searchRange(arr, 0, 1, target));
    }

    static int searchRange(int[] arr, int start, int end, int target) {
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, start, end, target);
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }
        while (start <= end) {
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
