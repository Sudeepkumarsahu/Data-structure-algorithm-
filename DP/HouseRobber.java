import java.util.Arrays;

public class HouseRobber {
    // recursion
    public static int rob(int[] nums, int i, int n) {
        if (i >= n)
            return 0;
        int steal = nums[i] + rob(nums, i + 2, n);
        int skip = rob(nums, i + 1, n);
        return Math.max(steal, skip);
    }

    // recursion + memoization = top-down approach
    public static int rob2(int[] nums, int i, int n, int[] dp) {
        if (i >= n)
            return 0;
        if (dp[i] != -1)
            return dp[i];
        int steal = nums[i] + rob2(nums, i + 2, n, dp);
        int skip = rob2(nums, i + 1, n, dp);
        return dp[i] = Math.max(steal, skip);
    }

    // bottom-up approach = tabulation
    public static int rob3(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int j = 2; j <= n; j++) {
            int steal = nums[j - 1] + dp[j - 2]; // rob current
            int skip = dp[j - 1]; // skip current
            dp[j] = Math.max(steal, skip);
        }

        return dp[n];
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 1 };
        int n = nums.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(rob(nums, 0, nums.length));
        System.out.println(rob2(nums, 0, nums.length, dp));
        System.out.println(rob3(nums));
    }
}
