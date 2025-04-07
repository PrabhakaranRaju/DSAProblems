package BinarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        System.out.println(ceiling(arr, 0, arr.length - 1, target));
    }

    //smallest element next to the target element or target element
    static int ceiling(int[] arr, int start, int end, int target) {
        if (arr.length == 0 || target > arr[arr.length - 1]) {
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
        return start;
    }
}
