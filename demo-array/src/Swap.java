public class Swap {
  public static void main(String[] args) {
    int[] arr = new int[] { 100, -400, 3, 99 };
    // code here .. to swap 100 and 99

    int temp = arr[0]; // backup
    arr[0] = arr[arr.length - 1];
    arr[arr.length - 1] = temp;

    // int arrMaxIndex = arr[arr.length - 1];
    // int arrMinIndex = arr[0];
    // // code here
    // arr[0] = arrMaxIndex;
    // arr[arr.length - 1] = arrMinIndex;
    for (int i = 0; i < arr.length; i++) {
    System.out.println("arr[" + i + "]=" + arr[i]);

    String str = "hello!";

    System.out.println(swapOddEvenCharater(str));
  }
  }
  // Swap
  public static String swapOddEvenCharater(String str) {
    // hello! -> ehll!o
    // abcd -> badc
    // aabb -> aabb
    // abcdef -> badcfe
    // abc -> bac
    // c -> c
    // "" -> ""
    // "ab cd" -> "bac d"
    // step 1 focus on test case
    // step 3 is it readibility

    int a = Math.abs((-123)); // 123

    char[] chars = str.toCharArray();
    char temp;
    for (int i = 0; i < chars.length - 1; i++) {
      if (i == chars.length - 1) { // step 2 change position to change performance?
        break;
      }
      if (i % 2 == 0) { // [0] [1] [2] [3]
        // swap
        temp = chars[i];
        chars[i] = chars[i + 1]; // error
        chars[i + 1] = temp;
      }
    }
    
    String str1 = String.valueOf(123); //"123"
    String str2 = String.valueOf(true); //false


    return String.valueOf(chars);  // static method
  }
}