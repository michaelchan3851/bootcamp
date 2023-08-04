public class Swap2 {
  public static void main(String[] args) {
    int[] nums = new int[] { 8, 3, -10, 30, 100, -19 };
    // Move the max number to the tail
    // {8, 3, -10, 30, -19, 100}
    // int temp;

    
    int maxValue = 0;
    int maxIndex = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > nums[maxIndex]) {
        maxValue = nums[i]; // backup
        maxIndex = i;
      }
    }

    int temp = nums[maxIndex];
    nums[maxIndex] = nums[nums.length - 1];
    nums[nums.length - 1] = temp;

    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
      int[] testcase = new int[] { 2, 3, 0 };
      System.out.println( average(testcase));// 1.66666...7, 
    
      int[]classA = new int[]{20, 30, 80, 100,30};
      int[]classB = new int[]{20, 30, 80};

      if (average(classA) > average(classB)){
        System.out.println("Class A has higher average score.");
      }

  }

  public static double average(int[] arr) {
    // calculate the average of all numbers in arr.

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    // explicit conversion
    return ((double) sum) / arr.length;
    // return double result = sum / arr.length; // int / int = int -> double
  }
}