import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

public class Superman implements Flyable {
  @Override
  public void fly() {
    System.out.println("I am flying");
  }

  public static void main(String[] args) {
    // 3 ways to new a flyable object
    // 1. Polymorphism , can share method to others
    Flyable superman = new Superman();
    // 2. Anonymous , have instance variable
    Flyable superman2 = new Flyable() {
      @Override
      public void fly() {
        System.out.println("I am anonymous");
      }
    };
    // 3. Lambda , no instance variable
    Flyable superman3 = () -> System.out.println("I am Lambda");
    int sum = 0;
    Optional<String> string = Optional.ofNullable("abc");

    string.ifPresent(e -> {
      // sum++; //it can't handle variable out of block
      // String s = "";
    });

    int total = 0;
    if (string.isPresent()) {
      total++; // it can handle variable out of block
      String s = "";
    }

    // s = s + ""; //it can't handle variable inside the block

    int t = 0;
    Arrays.asList(1, 2, 3, 4).stream()
        .count(); // 4
    // t++;

  }

  public static double add(double a, double b) {
    return BigDecimal.valueOf(a).add(BigDecimal.valueOf(b)).doubleValue();
  }


  
}
