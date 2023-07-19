public class Wrapper {
  public static void main(String[] args) {
    // Primitives: byte, short ...
    // Wrapper Classes, corresponding primitive

    boolean isMale = true; // isMale is NOT an object
    // Wrapper Class
    Boolean isFemale = true; // isFemale is an object reference

    isMale = false;
    if (isMale) {

    }
    if (isFemale.compareTo(isMale) == 0) { // asking if isFemale with the same value of isMale

    }
    isFemale = null; // true/ false/ null

    int num = 2;
    Integer num2 = 4; // num2 is an object reference
    num2 = null;

    num2 = 1000;
    String s = num2.toString(); // "1000"
    num2.toString();
    Integer.valueOf("123"); // 123
    Integer num3 = 4;

    if (num3.compareTo(3) > 0){
      System.out.println("num3 is > 3");
    }

    char a = 'a';
    Character c2 = 'A';
    char result = Character.toLowerCase('B'); // static method

    // Difference?
    Character c3 = Character.valueOf('s');
    Character c4 = 's';

  }
}
