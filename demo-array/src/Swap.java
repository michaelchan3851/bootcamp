public class Swap {
  public static void main(String[] args) {
    int[] arr = new int[] { 100, -400, 3, 99 };
    // code here .. to swap 100 and 99

    // int temp = arr[0]; // backup
    // arr[0] = arr[arr.length - 1];
    // arr[arr.length - 1] = temp;

    // // int arrMaxIndex = arr[arr.length - 1];
    // // int arrMinIndex = arr[0];
    // // // code here
    // // arr[0] = arrMaxIndex;
    // // arr[arr.length - 1] = arrMinIndex;
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println("arr[" + i + "]=" + arr[i]);

    String str = "hello";
    str = swapOddEvenCharater(str);
    System.out.println(str);
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
    char[] chr = str.toCharArray();
    for (int i = 0; i < str.length(); i++) {
      char temp;
      if (i % 2 == 0 && i < str.length() - 1) {
        temp = chr[i];
        chr[i] = chr[i + 1];
        chr[i + 1] = temp;
      }
      str += chr[i];
    }
    return str;
  }

