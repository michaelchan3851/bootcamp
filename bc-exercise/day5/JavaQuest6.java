/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 ...
 * 
 */
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int a = 1;
    int b = 1;
    int sum;
    int count = 0;
    for (int i = 0; i < 15; i++) {
      sum = a + b;
      System.out.print(a + " ");
      a = b;
      b = sum;
    }
  }
}
//a=1, b=1,a+b= sum ->show result 
//sum->a , b=a, sum + a ->print result