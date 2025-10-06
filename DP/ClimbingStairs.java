public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1; //
        int one_step = climbStairs(n - 1);
        int two_step = climbStairs(n - 2);
        return one_step + two_step;
    }

    public static int climbStairsBottomUp(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static int climbStairsDP(int n) {
        int[] dp = new int[n + 1];
        if (n < 4) {
            return n;
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static int climbStairsOptimized(int n) {
        if (n <= 1)
            return 1;
        int prev2 = 1, prev1 = 1; // dp[0] and dp[1]
        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        // brute force approach
        System.out.println(climbStairs(4));

        // top-down approach (memoization)
        System.out.println(climbStairsBottomUp(4)); // 2

        // bottom-up dynamic programming approach
        System.out.println(climbStairsDP(4)); // 2

        System.out.println(climbStairsOptimized(4));
    }

}