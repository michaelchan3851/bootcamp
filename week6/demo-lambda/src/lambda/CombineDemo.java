package lambda;

import java.util.function.Predicate;

public class CombineDemo {
  public static void main(String[] args) {
    Predicate<String> startWithV = s -> s.startsWith("V");
    Predicate<String> endWithE = s -> s.endsWith("E");

    Predicate<String> combined = startWithV.and(endWithE);
    System.out.println(combined.test("VE")); // true
    System.out.println(combined.test("AE")); // false
    System.out.println(combined.test("VA")); // false

    Predicate<String> combined2 = startWithV.or(endWithE);
    System.out.println(combined2.test("VE")); // true
    System.out.println(combined2.test("AE")); // true
    System.out.println(combined2.test("VA")); // true
  }
}
