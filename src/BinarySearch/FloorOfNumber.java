package BinarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int target = 5;
        System.out.println(flooring(arr, 0, arr.length - 1, target));
    }

    //largest element previous to the target element or target element
    static int flooring(int[] arr, int start, int end, int target) {
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
        return end;
    }
}
