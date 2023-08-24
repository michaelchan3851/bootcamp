import java.util.List;

public class DemoGenerics {
  public static void main(String[] args) {
    Database<Integer> strings = new Database<>();
    Database.add(new DemoGenerics()); // static method is independent "generics"
  }
}
