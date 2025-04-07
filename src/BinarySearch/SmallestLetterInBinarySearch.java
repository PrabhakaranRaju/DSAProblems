package BinarySearch;

public class SmallestLetterInBinarySearch {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(ceiling(letters, 0, letters.length - 1, target));
    }

    //smallest element next to the target element or target element
    static char ceiling(char[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
//            if (arr[mid] == target) {
//                return mid;
//            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
