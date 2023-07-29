
import java.util.Arrays;

public class StringBox2 {

  private char[] string;

  public StringBox2() {

  }

  public StringBox2(char[] sources) {
    // approach 1
    // this.string = new char[sources.length] ; // new object
    // for (int i = 0; i< sources.length;i++){
    // string[i] = sources[i];
    // }
    // approach 2
    // copyOf() -> new array object, and with the copy values of the original
    this.string = Arrays.copyOf(sources, sources.length);
  }

  // public StringBox2 append(String s) { // hello -> helloworld
  // // String ->
  // char[] res = new char[this.string.length + s.length()];
  // int idx = 0;
  // int j = 0;
  // while (j < this.string.length) {
  // res[idx] = this.string[j];
  // idx++;
  // j++;
  // }
  // j = 0;
  // while (j < s.length()) {
  // res[idx] = s.charAt(j);
  // idx++;
  // j++;
  // }
  // this.string = res;
  // return this;
  // }

  public StringBox2 append(String s) {
    char[] res = new char[this.string.length + s.length()];
    int idx = 0;
    for (int i = 0; i < this.string.length; i++) {
      res[idx] = this.string[i];
      idx++;
    }
    for (int i = 0; i < s.length(); i++) {
      res[idx] = s.charAt(i);
      idx++;
    }
    this.string = res;
    return this;
  }

  public void setString(char[] string) {
    this.string = string;
  }

  public char[] geString() {
    return this.string;
  }

  public String toString() {
    return String.valueOf(this.string); // [a, c, b]
  }

  public static void main(String[] args) {
    char[] chars = new char[] { 'a', 'c', 'b' };

    StringBox2 box = new StringBox2(chars);
    System.out.println(box.toString()); // [a, c, b]

    chars[1] = 'x';
    System.out.println(String.valueOf(chars));// [a, x, b]
    System.out.println(box.toString());// [a, c, b]

    System.out.println(box.append("def").toString());
  }
}
