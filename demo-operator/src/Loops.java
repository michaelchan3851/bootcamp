public class Loops {
  public static void main(String[] args) {
    // For loop
    int a = 0;
    ++a;
    a++;
    // indepence expression ++a = a++
    for (int i = 0; i < 4; ++i) {// (initialization; condition; update)
      // (1. must include three item, 2. follow the sequence )
      System.out.println("i=" + i + ", Hello");
      // Logic Flow:
      // i = 0 -> 0 < 4, 1st Hello
      // ++i -> i = 1 -> 2 < 4, 2nd Hello
      // ++i -> i = 2 -> 3 < 4, 3rd Hello
      // ++i -> i = 3 -> 4 is NOT smaller than 4,exit loop, 4th Hello
    }

    for (int j = 6; j > 0; j--) {
      System.out.println("j=" + j); // 6 times
    }

    for (int i = 0; i > -3; --i) {
      System.out.println("Hello world");
    }

    //for (int i = 0; i < 0; i++) {// NOT applied, NOT executed
      //System.out.println("v");
    //}

    int max = 10;
    int count = 0;
    for (int i = 0; i < max; ++i) {
      count += i; // 0, 1 ... 9
      System.out.println("count=" +count); // 45
    }
    // count=?

    // 1. Sum up all odd numbers
    // 2. Sum up all odd numbers, except 5
    int sum = 0;
    int sumOddNumWithout5 = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1) {
        sum += i;
        // System.out.println(sum);
      } // odd number
      if (1 % 2 == 1 && i != 5) {
        sumOddNumWithout5 += i;
      }
      System.out.println("sum=" + sum);
      System.out.println("sumoddnumwithout=" + sumOddNumWithout5);
    }
    // 25
    // sumOddNumWithout5 = 20

    for (int i = 0; i < 5; ++i) {
      System.out.println("hello");
      if (i > 2) {
        break;
      }
    }
    // i = 0, hello
    // i = 1, hello
    // i = 2, hello
    // i = 3, hello
    // break;
    for (int i = 0; i < 5; ++i) {
      System.out.println("GOOD");
      if (i == 3) {
        break;
      }
    }

    for (int i = 0; i < 10; ++i) {
      System.out.println("Well" + i++);
      if (i % 2 == 0) {
        continue;
      }
      System.out.println(i);
    }

    // continue
    for (int i = 0; i < 6; i++) {
      System.out.println("i=" + i + "Hello!");
      if (i > 3) {
        continue;// go to the next iteration
      }
      System.out.println("i=" + i + "Bye!");
    }
    // i = 0, hello, bye
    // i = 1, hello, bye
    // i = 2, hello, bye
    // i = 3, hello, bye
    // i = 4, hello
    // i = 5, hello
    // i = 6, exit

    for (int i = 0; i < 8; i++) {
      if (i % 2 == 0) {
        if (i % 3 == 0) {// if ( i % 2 == 0 && i % 3 == 0)
          System.out.println("i=" + i);
        }
      }
    }

    // Nested Loop
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("Hello");
      }
    } // How many Hello?
      // i = 0, j = 0, Hello
      // i = 0, j = 1, Hello
      // i = 0, j = 2, Hello
      // i = 0, j = 3, Exit
      // i = 1, j = 0, Hello
      // i = 1, j = 1, Hello
      // i = 1, j = 2, Hello
      // i = 1, j = 3, Exit
      // i = 2, j = 0, Hello
      // i = 2, j = 1, Hello
      // i = 2, j = 2, Hello
      // i = 2, j = 3, Exit
      // i = 3, j = 0, Hello
      // i = 3, j = 1, Hello
      // i = 3, j = 2, Hello
      // i = 3, j = 3, Exit

    // *
    // **
    // ***
    // ****
    // *****
    // System.out.println; -> nextline after print out
    // System.out.print() is not allowed

    // Approach 1: Nexted Loop
    // System.out.println() & System.out.print()
    for (int i = 0; i < -5; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    // Approach 2: Single Loop & String
    // System.out.println()
    String str = "";
    for (int i = 0; i < 5; i++) {
      str += "*";
      System.out.println(str);
    }

    // Approach 3: Nested Loop & String
    // System.out.println()
    str = "";
    for (int i = 0; i < 5; i++) {
      str = "";
      for (int j = 0; j < i + 1; j++) {
        str += "*";
      }
      System.out.println(str);
    }

  }
}
