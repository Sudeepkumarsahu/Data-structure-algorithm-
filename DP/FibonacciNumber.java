import java.util.Arrays;

// public class FibonacciNumber {
//     public static int fibonacci(int n, int[] dp) { 
//         if (n <= 1)
//             return n;
//         if (dp[n] != -1) {
//             return dp[n];
//         }
//         return dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
//     }

//     public static void main(String[] args) {
//         int n = 6;
//         int dp[] = new int[n + 1];//
//         Arrays.fill(dp, -1);// Initialize all dp elements to -1
//         int ans = fibonacci(n, dp);
//         System.out.println(ans);
//     }
// }

// public class FibonacciNumber { // bottom-up approach
//     public static void main(String[] args) { //time complexity O(n) && space complexity O(n)
//         int n = 6;
//         int dp[] = new int[n + 1];
//         dp[0] = 0;
//         dp[1] = 1;
//         for (int i = 2; i <= n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2];
//         }
//         System.out.println(dp[n]);
//     }
// }

public class FibonacciNumber { // more optimised approach
    public static int fibonacci(int n) {//time complexity O(n) && space complexity O(1)
     if(n<=1) return n;
     int a = 0, b = 1,c=0;
     for(int i=1;i<n;i++){
         c = a + b;
         a = b;
         b = c;
     }
     return c;
    
    } //time complexity O(n) && space complexity O(1)
    public static void main(String[] args) { 
        int n = 6;
        System.out.println(fibonacci(n));
    }
}
