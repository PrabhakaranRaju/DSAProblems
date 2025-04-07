package BinarySearch;

public class PeakElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        System.out.println(binarySearch(arr, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return end;
        //return start also works
    }
}
