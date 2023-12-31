import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;

public class DoubleProblem {
  public static void main(String[] args) {
    double result = 0.1 + 0.2;
    System.out.println(result); // 0.30000000000000004

    if (result == 0.3)
      System.out.println("result = 0.3");
    else
      System.out.println("result != 0.3");

    System.out.println(0.3 / 0.1); // 2.9999999999999996
    System.out.println(0.2 * 0.1); // 0.020000000000000004

    // Solution:
    BigDecimal b = new BigDecimal(5);
    BigDecimal b2 = BigDecimal.valueOf(4);
    // BigDecimal b3 = 5.0; // Not Ok
    Double d = 5.0d;

    System.out.println(b.multiply(b)); // 25
    System.out.println(b.subtract(b2)); // 5 - 4 = 1
    System.out.println(b.add(b)); // 5 + 5 = 10
    System.out.println(b.divide(b)); // 5 / 5 = 1
    System.out.println(b.add(new BigDecimal(7))); // 5 + 7 = 12

    System.out.println(b.compareTo(b2)); // b = 5, b2 = 4, b > b2 result 1 true
    System.out.println(b2.compareTo(b)); // b = 5, b2 = 4, b2 > b result -1 false
    System.out.println(b.compareTo(BigDecimal.valueOf(5))); // b = 5, b = 5, b > b result 0 

    BigDecimal b3 = BigDecimal.valueOf(3.456);
    System.out.println(b3.setScale(2, RoundingMode.UP)); // 3.46
    System.out.println(b3.setScale(2, RoundingMode.DOWN)); // 3.45
    
    System.out.println(b.equals(b2)); // 5 != 4 -> false
    System.out.println(b.equals(b2)); // 5 != 4 -> false

    BigDecimal b4 = BigDecimal.valueOf(5);
    System.out.println(b.equals(b4)); // true, 5 == 5
    System.out.println(b == b4); // false
    String str = "😀";
    System.out.println(str.toCharArray());
    System.out.println(b4.remainder(BigDecimal.valueOf(3))); //5 % 3 = 2
    System.out.println(b.divide(b4));
  }
}
