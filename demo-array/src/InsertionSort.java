import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    // [ 5, 1, 4, 8, 2]
    // step1.1: [1, 5, 4, 8, 2] (insert 1 to arr[0], 1 < 5)
    // After round 1, [1, 5] is sorted
    // step2.1 Compare 4 < 5 -> move 5 to the right hand side
    // step2.2 Compare 1 < 4 -> [1, 4, 5]
    // After round 2, [1, 4, 5] is sorted
    // ...
    int[] nums = new int[] { 5, 1, 4, 8, 2 };
    for (int i = 1; i < nums.length; i++) {
      int current = nums[i];
      int j = i - 1;
      while (j >= 0 && nums[j] > current) {
        nums[j + 1] = nums[j];
        j--;
      }
      nums[j + 1] = current;
      System.out.println("step" + i +"."+j + Arrays.toString((nums)));
    }
    System.out.println("step" + Arrays.toString((nums)));

    for (int i = 1; i < nums.length; i++){
      int j, key;
      int nums[key] = nums[i];

    }
  }
}
