public class WhileLoop {
  public static void main(String[] args) {
    // while
    int count = 0;
    while (count < 5) { // continue condition: ture/ false
      count++;
      System.out.println("count=" + count);
    }
    // count = 5

    boolean isHoliday = false;
    int counter = 0;
    while (!isHoliday) { // Is Not Holiday == fasle
      System.out.println("counter=" + counter);
      counter++;
      if (counter >= 6) {
      } else {
        isHoliday = true;
      }
    }

    int c = 0;
    while (c >= 0 && c < 5) { // same variable use &&, different variable use ||
      System.out.println(c);
      c++;
    } // c=4, print 5 times

    int a = 0;
    int b = 10;
    while (a < 5 || b > 0) { // while a >=5, (false || true)
      System.out.println("hello" + b);
      a++;
      b--;
    }

    // break,
    int k = 0;
    while (k < 6) {
      System.out.println("break: hello"); // 4 times
      k++;
      if (k > 3) {
        break;
      }
    }

    // continue;
    int j = 0;
    while (j < 6) {
      j++;
      if (j > 3) { // after continue should be have something, 3times
        continue;
      }
      System.out.println("continue: hello");
    }
  }
}
// for (int i = 0; i < 3; ++i) {
// if (i > 1) {
// i++; error
// }
// }