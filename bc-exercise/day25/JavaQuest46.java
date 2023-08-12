/*
 * Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 * 
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 * 
 */
public class JavaQuest46 {
  public static void main(String[] args) {
    System.out.println(findGCD(new int[] { 2, 5, 6, 9, 10 }));
    System.out.println(findGCD(new int[] { 7, 5, 6, 8, 3 }));
    System.out.println(findGCD(new int[] { 3, 3 }));

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
    int count = 0;
    for (int i = 1; i <= max; i++) {
      if (min % i == 0 && max % i == 0)
        count = Math.max(count,i);
    }
    return count;
  }
}