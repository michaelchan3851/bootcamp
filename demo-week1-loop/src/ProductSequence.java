public class ProductSequence {
  public static void main(String[] args) {
    // use for loop
    // 0, 1, 2 , 3 , 4, 5 ....
    // print out 0, 2, 6, 12, 20 ....
    // print the first 20 number of the above requirement
    int count = 0;
    int a, b, c;//declare 2 varibles in one go
    for (int i = 0; i < 20; i++) {
      a = i;
      b = i + 1;
      c = a * b;
      count++;
      if (count >= 20) {
        break;
      }
      System.out.print(c + " ");
    }

  }
}
