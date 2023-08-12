package box;
import java.util.ArrayList;

public class Box<T extends Number> {

  private ArrayList<T> numbers;

  private Box() {
    numbers = new ArrayList<>();
  }

  public Box(T number) {
    this();
    numbers.add(number); // null pointer
  }

  public ArrayList<T> getNumbers() {
    return this.numbers;
  }

  public void add(T number) {
    numbers.add(number); // null pointer
  }

  public int size() {
    return numbers.size();
  }
  // public void setNumber(T[] numbers) {
  // this.numbers = numbers;
  // }

  public static void main(String[] args) {
    // Box<String> box1 = new Box<>();
    Box<Integer> box1 = new Box<>(100);// compile-time check
    System.out.println(box1.size()); // 1

  }

}
