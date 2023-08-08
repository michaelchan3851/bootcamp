package hashset1;

import java.util.HashSet;

public class DemoHashSet {

  public static void main(String[] args) {
    // HashSet is good at handling

    HashSet<String> strings = new HashSet<>();
    System.out.println(strings.add("abc")); // true
    System.out.println(strings.add("def")); // true
    System.out.println(strings.size()); // 2
    // HashSet
    boolean result = strings.add("abc");
    System.out.println(strings.size()); // 2
    System.out.println(result); // false
    // cancel duplicate element

    if (strings.add("def")) {
      System.out.println("def is added");
    } else {
      System.out.println("def is not added");
    }

    // Example 2:With Override equal(method)
    HashSet<Coordinate> coordinates = new HashSet<>();
    Coordinate c1 = new Coordinate(1, 1);
    Coordinate c2 = new Coordinate(1, 1);
    System.out.println(coordinates.add(c1)); // true
    System.out.println(coordinates.add(c2)); // false, Coodintate equals() return true
    // hashset add() -> coordinate c2.equals(any of coordinate in hashset) return
    // true
    // -> c2.equals(c1) -> diff address -> true
    // -> HashSet not allow duplicates
    // -> return false
    System.out.println(coordinates.size()); // 2
    // call your equals method to compare
    // is it duplicate is depends on you

    Coordinate c3 = new Coordinate(2, 1);
    System.out.println(coordinates.add(c3));// true, Coordintate equals() return false
    System.out.println(coordinates.size()); // 2

    // Example3 Without Override equal(method)
    HashSet<Book> books = new HashSet<>();
    System.out.println(books.add(new Book("dummy", "Eric")));// true
    System.out.println(books.add(new Book("dummy", "Eric")));// true
    System.out.println(books.add(new Book("dummy", "Steven")));// true , diff address
    // true , because it can add in to hashset
  }
}
