package printer;
//Generic
public class Printer<T> {
  // 1. Class Signature, add <>, T represent any Class
  T value;
  T[] numbers;
  Object object;

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public Object getObject() {
    return this.object;
  }

  public void setObject(Object object) {
    this.object = object;
  }

  public void print() {
    System.out.println(this.value);
  }

  public static void main(String[] args) {
    Printer<String> p1 = new Printer<>();
    // Strong Tpye checking -> check if you put a real class into <>
    p1.setValue("abc");
    System.out.println(p1.getValue()); // abc

    Printer<Integer> p2 = new Printer<>();
    p2.setValue(100);
    System.out.println(p2); // 100

    Printer<Boolean> p3 = new Printer<>();
    p3.setObject("String");
    System.out.println(((String) p3.getObject()).charAt(0)); // Not a String

  }

}
