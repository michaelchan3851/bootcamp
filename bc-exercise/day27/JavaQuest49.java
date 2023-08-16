/*
* Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.


Example 1:
Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.

Example 2:
Input: nums = [7,5,6,8,3]
Output: 1
Explanation:
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.

Example 3:
Input: nums = [3,3]
Output: 3
Explanation:
The smallest number in nums is 3.
The largest number in nums is 3.
The greatest common divisor of 3 and 3 is 3.

Constraints:

2 <= nums.length <= 1000
1 <= nums[i] <= 1000
*/
public class JavaQuest49 {
  public static void main(String[] args) {
    System.out.println(findGCD(new int[] { 2, 5, 6, 9, 10 }));// 2
    System.out.println(findGCD(new int[] { 7, 5, 6, 8, 3 }));// 1
    System.out.println(findGCD(new int[] { 3, 3 }));// 3
    System.out.println(findGCD(new int[] { 10, 100, 1000 }));// 10
    System.out.println(findGCD(new int[] { 99, 999 }));// 9
  }

  public static int findGCD(int[] nums) {
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      max = Math.max(max, nums[i]);
    }
    int min = max;
    for (int i = 0; i < nums.length; i++) {
      min = Math.min(min, nums[i]);
    }

    int divisor = 1;
    for (int i = 1; i <= min; i++) {
      if (max % i == 0 & min % i == 0) {
        divisor = Math.max(i, divisor);
      }
    }
    return divisor;
  }
}