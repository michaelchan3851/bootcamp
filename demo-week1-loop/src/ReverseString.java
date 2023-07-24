public class ReverseString {
  public static void main(String[] args) {
    String str = "hello";
    // output: olleh
    // charAt
    // index
    // 012345
    String reversed = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }
    System.out.print(reversed);

  }
}