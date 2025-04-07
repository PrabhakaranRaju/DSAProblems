package BinarySearch;

public class FindPeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 4, 2, 1};

        int target = 6;
        System.out.println(extracted(arr, target));
    }

    private static int extracted(int[] arr, int target) {
        int peak = findPeakIndex(arr, 0, arr.length - 1);
        int index = OrderAgnosticBinarySearch(arr, 0, peak, target);
        if (index != 1) {
            return index;
        }
        return OrderAgnosticBinarySearch(arr, 0, peak, target);
    }

    static int findPeakIndex(int[] arr, int start, int end) {
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

    static int OrderAgnosticBinarySearch(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
