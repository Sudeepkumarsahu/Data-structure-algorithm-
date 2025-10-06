import java.util.*;

public class ReverseInGroups {
    
    public static void reverseInGroups(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i += k) {
            int left = i, right = Math.min(i + k - 1, n - 1);
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4, 5, 6, 7, 9};
        int k = 3;
        
        reverseInGroups(nums, k);
        
        System.out.print("Array after reversing in groups of " + k + ": ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
