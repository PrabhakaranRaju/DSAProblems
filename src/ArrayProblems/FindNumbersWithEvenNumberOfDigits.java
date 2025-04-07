package ArrayProblems;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            int digits = numberOfDigits(num);
            if (even(digits)) {
                counter++;
            }
        }
        return counter;
    }

    static int numberOfDigits(int num) {
        if (num < 0) {
            num = num * -1;
        }
//        int count = 0;
//        while (num > 0) {
//            count++;
//            num = num / 10;
//        }
//        return count;
        return (int) Math.log10(num) + 1;
    }

    static boolean even(int counter) {
        return counter % 2 == 0;
    }
}
