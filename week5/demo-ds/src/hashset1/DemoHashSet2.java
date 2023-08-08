package hashset1;
import java.util.HashSet;

public class DemoHashSet2 {
  public static void main(String[] args) {
    // HashSet Byte
    HashSet<Byte> bytes = new HashSet<>();
    bytes.add(bytes(4)); // int -> byte -> Byte
    boolean isAdded10 = bytes.add(bytes((10))); // int -> byte -> Byte
    // Java is not necessary to handle return value
    boolean isAdded4 = bytes.add((bytes(4)));
    System.out.println(isAdded4); // false

    HashSet<Byte> bytes2 = new HashSet<>();
    bytes.add(bytes(4));
    bytes.add(bytes(10));
    System.out.println(bytes.equals(bytes2)); // true, Byte equals()
    // Wrapper class equals is check value

    boolean isRemoved10 = bytes.remove(bytes(10)); // 10 is values
    System.out.println(isRemoved10);// true

    bytes.clear();
    bytes2.clear();
    System.out.println(bytes.size()); // clear -> 0
    System.out.println(bytes2.size()); // clear -> 0
  }

  public static Byte bytes(int num) {
    return Byte.valueOf((byte) num);
  }
}
