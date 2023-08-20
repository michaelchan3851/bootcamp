public record Person1(String name, int age) implements TestInterface { // Java14
  // Immutable Objects
  // final class, support Generics
  // Support Interface, but no further extend (extends Object.class)
  // private final String name;
  // private final int age;
  // All- args constructor ONLY
  // All Getters
  // No Setters (final instance variable)
  // custom static methods, static variable
  // custom constant
  // custom instance methods
  // No other instance variables
  // Already @Override equals(), hashCode(), toString()

  // int salary;

  static int counter = 0; // class variable

  static final int MAX_VALUE = 100; // constant
  static final int MIN_PAY = 100; // constant

  public boolean isElderly(int age) {
    return age >= 65;
  }

  // Tools
  public static int add(int x, int y) {
    return x + y;
  }

  @Override
  public void read() {
    System.out.println("I am read");
  }
}
