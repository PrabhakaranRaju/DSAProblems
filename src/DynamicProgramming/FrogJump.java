package DynamicProgramming;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10};
        int n = arr.length - 1;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        //System.out.println(frogJumpUsingMemoization(arr, dp, n));
        //System.out.println(frogJumpUsingTabulation(arr, dp, n));
        System.out.println(frogJumpUsingSpaceOptimization(arr, n));
    }

    static int frogJumpUsingMemoization(int[] arr, int[] dp, int n) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int right = Integer.MAX_VALUE;
        //jump one step
        int left = frogJumpUsingMemoization(arr, dp, n - 1) + Math.abs(arr[n] - arr[n - 1]);
        if (n > 1) {
            //jump two steps
            right = frogJumpUsingMemoization(arr, dp, n - 2) + Math.abs(arr[n] - arr[n - 2]);
        }
        return dp[n] = Math.min(left, right);
    }

    static int frogJumpUsingTabulation(int[] arr, int[] dp, int n) {
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int right = Integer.MAX_VALUE;
            int left = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            if (i > 1) {
                right = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
            }
            dp[i] = Math.min(left, right);
        }
        return dp[n - 1];
    }

    static int frogJumpUsingSpaceOptimization(int[] arr, int n) {
        int prev1 = 0;
        int prev2 = 0;
        for (int i = 1; i < n; i++) {
            int right = Integer.MAX_VALUE;
            int left = prev1 + Math.abs(arr[i] - arr[i - 1]);
            if (i > 1) {
                right = prev2 + Math.abs(arr[i] - arr[i - 2]);
            }
            int curri = Math.min(left, right);
            prev2 = prev1;
            prev1 = curri;
        }
        return prev1;
    }
}
