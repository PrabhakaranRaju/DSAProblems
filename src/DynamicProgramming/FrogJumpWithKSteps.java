package DynamicProgramming;

import java.util.Arrays;

public class FrogJumpWithKSteps {
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 50, 20};
        int n = arr.length - 1;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int k = 3;
        System.out.println(frogJumpWithMemoization(arr, dp, n, k));
        System.out.println(frogJumpWithTabulation(arr, dp, n, k));

    }

    static int frogJumpWithMemoization(int[] arr, int[] dp, int n, int k) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int minSteps = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (n - i >= 0) {
                int jump = frogJumpWithMemoization(arr, dp, n - i, k) + Math.abs(arr[n] - arr[n - i]);
                minSteps = Math.min(jump, minSteps);
            }
        }
        return dp[n] = minSteps;
    }

    static int frogJumpWithTabulation(int[] arr, int[] dp, int n, int k) {
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int minSteps = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(arr[i] - arr[i - j]);
                    minSteps = Math.min(jump, minSteps);
                }
            }
            dp[i] = minSteps;
        }
        return dp[n];

    }
}
