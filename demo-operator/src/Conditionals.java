public class Conditionals {
  public static void main(String[] args) {
    // if, else if, else
    int i = 10;
    if (i > 9) { // asking if i > 9, if yes, execute block of the codes
      System.out.println("i=" + i); // i=10
    }
    // flow control: if-else
    if (i < 8) { // not fulfill
      System.out.println("i is smaller than 8");
    } else {
      System.out.println("i is larger than or equals to 8");
    }
    // else-if
    if (i > 12) {
      System.out.println("i > 12");// not executed
    } else if (i <= 12 && i >= 0) {
      System.out.println("i <= 12 and i >= 0");// executed
    } else {
      System.out.println("i is negative");// not executed
    }
    int a = 2;
    int b = 5;
    int box = 0;
    if (a > b) {
      box = 10;// not fulfill
    } else { // executed
      box = 19;
    }
    // box = 19
    int number = 11;
    if (number % 2 == 1) {// checking if number is an odd number
      // do something here
      System.out.println("number is an odd number");
    }
    if (number % 2 == 0) { // checking if number is an even number
      System.out.println("number is an even number");
    }
    // String
    String str = "Monday";
    if (str.equals("Monday")) {
      System.out.println("str = Monday");
    }
    if (str.charAt(4) == 'd') { // false, charAt(4) -> 'a'
      System.out.println("yes");
    } else {
      System.out.println("No");
    }
    if (str.length() > 10) { // false
      System.out.println("length > 10");
    }
    if (str.equals("Monday") || str.charAt(4) == 'd' || str.length() > 10) {
      System.out.println("What is the result now? Yes");// yes, "||"
    }

    int score = 89;
    char grade = ' ';
    if (score >= 90) {// false
      grade = 'A'; // NOT executed
    } else if (score >= 80) { // true
      grade = 'B';// executed
    } else if (score >= 70) { // checking? No
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    // grade ?
    System.out.println("your grade is " + grade);

    // good version
    int age = 65;
    boolean isElderly = age >= 65; // true

    // if (age >= 65) {}
    if (isElderly) { // true or false
      System.out.println("yes he is elderly");
    }

    // worse version
    int age2 = 65;

    if (age2 >= 65) {
      System.out.println("yes he is elderly");
    }

    // switch
    // simple version
    // assignment
    int dayOfWeek = 3;
    String dayName = "";
    switch (dayOfWeek) {// check if value equal to the following cases
      case 1:
        dayName = "Monday";
        break; //exit
      case 2:
        dayName = "Tuesday";
        break; //exit
      case 3: 
        dayName = "Wednesday";
        break; //exit
      case 4:
        dayName = "Thursday";
        break; //exit
      case 5:
        dayName = "Friday";
        break; //exit
      case 6:
        dayName = "Saturday";
        break; //exit
      case 7:
        dayName = "Sunday";
        break; //exit
        //default

    }
    System.out.println("Today is " + dayName);
 
  }
}
