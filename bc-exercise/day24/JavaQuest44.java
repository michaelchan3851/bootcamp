/*
 * You are given a positive integer array nums.
 * 
 * The element sum is the sum of all the elements in nums. The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums. Return the absolute difference between the element
 * sum and digit sum of nums.
 * 
 * Note that the absolute difference between two integers x and y is defined as |x - y|.
 * 
 * Example 1: Input: nums = [1,15,6,3] Output: 9 Explanation: The element sum of nums is 1 + 15 + 6 + 3 = 25. The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16. The absolute difference between the
 * element sum and digit sum is |25 - 16| = 9.
 * 
 * Example 2: Input: nums = [1,2,3,4] Output: 0 Explanation: The element sum of nums is 1 + 2 + 3 + 4 = 10. The digit sum of nums is 1 + 2 + 3 + 4 = 10. The absolute difference between the element sum
 * and digit sum is |10 - 10| = 0.
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 2000 1 <= nums[i] <= 2000
 */
public class JavaQuest44 {
  public static void main(String[] args) {
    System.out.println(differenceOfSum(new int[] { 1, 15, 6, 3 })); // 9
    System.out.println(differenceOfSum(new int[] { 1, 2, 3, 4 })); // 0
    System.out.println(differenceOfSum(new int[] { 1995, 1996, 1997, 2000 }));// 7911

  }

  public static int differenceOfSum(int[] nums) {
    int sum = 0;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    for (int i = 0; i < nums.length; i++) {
      while (nums[i] > 0) {
        count += nums[i] % 10;
        nums[i] /= 10;
      }
    }
    return sum - count;
  }
}