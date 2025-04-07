package DynamicProgramming;

import java.util.Arrays;

public class ClimbingStars {
    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        //System.out.println(find(n, dp));
        //System.out.println(findUsingTabulation(n, dp));
        System.out.println(findUsingSpaceOptimization(n));
    }

    static int find(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = find(n - 1, dp) + find(n - 2, dp);
    }

    static int findUsingTabulation(int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    static int findUsingSpaceOptimization(int n) {
        int prev2 = 0;
        int prev1 = 1;
        for (int i = 2; i <= n; i++) {
            int curri = prev1 + prev2;
            prev2 = prev1;
            prev1 = curri;
        }
        return prev1;
    }
}

