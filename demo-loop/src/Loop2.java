public class Loop2 {
  public static void main(String[] args) {

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 3; j++) { // result 1 + 2 + 3 + 3 + 3 + 3 = 15 times results
        System.out.println("i=" + i + " j=" + j);
        if (i == j) {
          break; // this break statement just break the inner loop
        }
      }
      // here
    }
    // i=0 j=0, yes, break
    // i=0 j=1 no
    // i=0 j=2 no, break
    // i=1 j=0 yes
    // i=1 j=1 yes, break
    // i=1 j=2 no

    // continue
    System.out.println("Example of Continue:");
    for (int i = 0; i < 6; i++) {// 0, 1, 2, 3,4,5
      for (int j = 0; j < 3; j++) {// 0, 1, 2
        if (i == j) {
          continue; // skip the rest in inner loop, go to next iteration
        }
        System.out.println("i=" + i + ", j=" + j);
      }
      // i=0 j=0,yes,continue, no print
      // i=0 j=1,yes, print
      // i=0 j=2, yes print
      // i=0 j=3, no
      // i=1 j=0 yes
      // i=1 j=1 yes,continue no print
      // i=1 j=2 yes
      // i=1 j=3 no
      // i=2 j=0 yes
      // i=2 j=1 yes
      // ...
    }

    String str = "I love programming. I love Java.";
    System.out.println("str length=" + str.length());// 32

    int num = 0;
    for (int i = 0; i < str.length(); i++) {// i < 32 stop run ( 0 - 31)
      System.out.println("Hello");
    }

    // Print the index of the first occurrence of the character 'e'
    // first time of the character 'e'
    // str.charAt(int index)

    for (int i = 0; i < str.length(); ++i) {
      if (str.charAt(i) == 'e') {
        System.out.println("the index of the first occurrence of the character 'e' is " + i);
        break;
      }

      
    }
  }
}
// here
