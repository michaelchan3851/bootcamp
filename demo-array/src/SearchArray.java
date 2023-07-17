import java.util.Arrays;

public class SearchArray {
  public static void main(String[] args) {
    // search
    char target = 'm';
    char[] chars = new char[] { 'j', 'p', 'm', 'q', 'c' };
    // Loop to find the index of the target in array chars
    for (int i = 0; i < chars.length; i++) {
      if (target == chars[i]) {
        System.out.println("index=" + i);
      }
    }
    // toCharArray()
    String str = "I am a boy."; // 11 characters
    char[] arr = str.toCharArray();// length 11
    // System.out.println(arr[11]);// error

    System.out.println(Arrays.toString(arr));
    // [I, , a, m, , a , , b, o, y, .]

    // Find Max. value in the array
    int[] nums = new int[] { 240, 800, -23, 6, 98 };
    int max = 0; // the min. of int
    int min = 99999999; // the max. of int
    // for loop
    for (int i = 0; i < nums.length; i++) {
      // i = 0, nums[0] -> 240
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    System.out.println(max);// max = 800

    // Find Min. Value in the array
    for (int i = 0; i < nums.length; i++) { // nums.length = 5
      // i = 0, nums[0] -> 240
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    System.out.println(min);// min = -23
    // very important!!//

  }
}
