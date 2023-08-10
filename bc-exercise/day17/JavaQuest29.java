/*Question : Given an integer n,
 add a dollar sign ("$") and a comma (",") as the thousands separator and return it in string format. */
/*Constraints:

0 <= n <= 231 - 1 */

public class JavaQuest29 {
  public static void main(String[] args) {
    System.out.println(separator(85));// $85
    System.out.println(separator(0));// $0
    System.out.println(separator(1000));// $1,000
    System.out.println(separator(123987405));// $123,987,405
    System.out.println(separator(10000));

  }

  public static String separator(int n) {
    // code here
    StringBuilder sb = new StringBuilder();
    String str = Integer.toString(n);
    int Len = str.length();
    for (int i = 0; i < Len; i++) {
      sb.append(str.charAt(i));
      if ((Len - i - 1) % 3 == 0 && i != Len - 1)
        sb.append(",");
    }
    return "$" + sb.toString();
  }
}