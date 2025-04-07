package ArrayProblems;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] nums = {3, 0, 1, 4, 5, 6};
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        System.out.println(totalSum - sum);
    }
}
