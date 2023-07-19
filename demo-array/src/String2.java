public class String2 {
  public static void main(String[] abc) {
    // method signature = method name + parameter type & quantity

    // trim(), remove leading space and trail space
    String str = "hello  ";
    String str2 = "  hel   lo   ";
    System.out.println("str.trim()=" + str.trim()); // "hello" remove first and the last space
    System.out.println("str.trim()=" + str2.trim()); // hel lo

    // starsWith(), check if the string start with the target string
    if (str.startsWith("hel")) {
      System.out.println("The string starts with hel");
    }
    // endsWith(), check if the string ends with the target string
    boolean endsWithSpace = str.endsWith(" "); // true
    if (endsWithSpace) {
      System.out.println("The String ends with space");
    }

    // indexOf(int) or indexOf(char) //the first index of
    // ********!!!!important!!!! *******/
    System.out.println("The index of o in str=" + str.indexOf('o')); // 4
    // indexOf(String)
    System.out.println("The index of o in str=" + str.indexOf("ll")); // 2 //first index of
    System.out.println("The index of o in str=" + str.indexOf("lll")); // -1 if can't found it, would be -1
    System.out.println(
        "The index of o in str, search from index 5 = " + str.indexOf('o', 5)); // -1
    System.out.println(
        "The index of ll in str, search from index 3 = " + str.indexOf("ll", 3)); // -1

    // The last indexOf(int), the last ocurrence of the char in the string
    String str3 = "hello";
    System.out.println("The last index of l in str=" + str3.lastIndexOf('l')); // 3
    System.out.println("The last index of ll in str=" + str3.lastIndexOf("ll")); // 2
    System.out.println("The last index of lll in str=" + str3.lastIndexOf("lll")); // -1
    System.out.println(
        "The last index of l in str, search from index 3 = " + str3.lastIndexOf('l', 3));
    // 3, index search start from last, but index doesnt change
    System.out.println(
        "The last index of ll in str, search from index 3 = " + str3.lastIndexOf("ll", 3)); // 2

    // replace !!!!important!!!!
    String s = "Java is a programming Java language";
    System.out.println(s.replace("Java", "Python")); // Python is a programming language
    System.out.println(s.replace('p', 'q')); // Java is a qrogramming language

    // equals(), equalsIgnoreCase()

    if ("hello".equals(str3)) { // true
      System.out.println("str3 = Hello");
    }
    if ("Hello".equals(str3)) { // false, case sensitive , looking at upper case or lower case
      System.out.println("str3 = Hello");
    }

    if ("Hello".equalsIgnoreCase(str3)) { // true, non case sensitive checking
      System.out.println("non case sensitive checking");
    }

    if ("HELLO".equals(str3.toUpperCase())) { // true
      System.out.println("Alternative");
    }

    // concat(String), append something (concatenation)
    String newString = str3.concat(" Java!"); // + operation
    System.out.println("newString=" + newString); // newString=hello Java!
    str3 = str3.concat(" Java!");
    System.out.println(str3);

    // compareTo(), just compare the first character of the string (by ASCII)
    String apple = "apple";
    String facebook = "facebook";
    System.out.println(apple.compareTo(facebook)); // -5, 97 - 102 ('a' - 'f')


    // 1.subString
    // 2.indexOf
    // 3.replace
    // 4.trim
    // 5.equals
  }
}
