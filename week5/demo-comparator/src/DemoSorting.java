import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class DemoSorting {
   public static void main(String[] args) {
      int[] arr = new int[] { 4, -10, 9, -20, 100 };
      Arrays.sort(arr); // n * logn, merge sort
      System.out.println(Arrays.toString(arr));

      // nlogn + n
      // reverse

      ArrayList<Integer> arrayList = new ArrayList<>();
      arrayList.add(100);
      arrayList.add(-100);
      arrayList.add(-88);
      arrayList.add(4);
      Collections.sort(arrayList); // nlogn, ascending sorting
      System.out.println(arrayList); // [-100, -88, 4, 100]

      Collections.sort(arrayList);

      ArrayList<Ball> balls = new ArrayList<>();
      balls.add(new Ball(4, Color.YELLOW));
      balls.add(new Ball(1, Color.BLUE));
      balls.add(new Ball(5, Color.YELLOW));
      balls.add(new Ball(100, Color.RED));
      Collections.sort(balls);
      System.out.println(balls.toString()); // [[id=100], [id=5], [id=4], [id=1]]
   }
}
