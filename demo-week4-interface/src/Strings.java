public class Strings implements CharSequence {

  char[] arr; // "abc", [a, b, c]

  private Strings(String str) {
    this.arr = new char[str.length()];
    // toCharrArray()
    for (int i = 0; i < arr.length; i++) {
      this.arr[i] = str.charAt(i); // string.charAt()
    }
  }

  public static Strings valueOf(String str) {
    return new Strings(str);
  }

  @Override
  public int length() {
    return arr.length;
  }

  @Override
  public char charAt(int idx) {
    return this.arr[idx];
  }

  public CharSequence subSequence(int start, int end) {
    if (start < 0 || end < 0 || end < start
        || start > this.arr.length - 1 || end > this.arr.length) {
      return String.valueOf(this.arr);
    }
    // return String, StringBuilder, StringBuffer
    StringBuilder sb = new StringBuilder(); // end -1
    for (int i = start; i < end; i++) {
      sb.append(this.arr[i]);
    }
    return sb.toString(); // String
  }

  public static void main(String[] args) {
    // CharSequence -> interface
    String str = "abc";
    Strings s = Strings.valueOf("abc");
    System.out.println(s.subSequence(1, 3)); // bc

  }
}
