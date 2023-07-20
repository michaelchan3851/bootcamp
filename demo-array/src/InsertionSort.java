import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    // [ 5, 1, 4, 2, 8]
    // step1.1: [1, 5, 4, 8, 2] (insert 1 to arr[0], 1 < 5)
    // After round 1, [1, 5] is sorted
    // step2.1 Compare 4 < 5
    // step2.2 Compare 1 < 4 -> [1, 4, 5]
    // After round 2, [1, 4, 5] is sorted
    // ...
    int[] nums = new int[] { 5, 1, 4, 8, 2 };
    System.out.println("step" + Arrays.toString(sort(nums)));
  }

  public static int[] sort(int[] arr) {
    int[] temp1 = new int[arr.length];
    int temp;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0, k = 0; j < arr.length; j++) {
        if (arr[j] > arr[j + 1]) {
          if (k == j + 1) {
            temp1[k++] = arr[j];
          }
          if (j != arr.length - 1 || j + 1 == arr.length) {
            temp1[k++] = arr[j];
          }
        }
      }
    }
    arr = temp1;

    return arr;
  }

}
