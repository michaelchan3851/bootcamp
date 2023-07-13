public class Training3 {
  public static void main(String[] args) {
    int age = 24;
    boolean isAdult = age >= 18;
    if (isAdult) {
      System.out.println("You are an adult.");// executed
    } else {
      System.out.println("You are not an adult.");
    }

    int score = 70;
    boolean isPass = score >= 60;
    if (isPass) {
      System.out.println("You are Pass.");// executed
    } else {
      System.out.println("Fail");
    }

    int number = 56;
    boolean isDividible = number % 2 == 0;
    if (isDividible) {
      System.out.println("Even");// true
    } else {
      System.out.println("Odd");
    }

    int num1 = 5;
    int num2 = 8;
    if (num1 > num2) {
      System.out.println("num1 is greater than num2.");
    } else {
      System.out.println("num1 is not greater than num2.");// because 5<8,so num1<num2
    }

    int dayOfWeek = 3;
    String Today = "";
    if (dayOfWeek == 1) {
      Today = "Monday";
    } else if (dayOfWeek == 2) {
      Today = "Tuesday";
    } else if (dayOfWeek == 3) {
      Today = "Wednesday";
    } else if (dayOfWeek == 4) {
      Today = "Thursday";
    } else if (dayOfWeek == 5) {
      Today = "Friday";
    } else if (dayOfWeek == 6) {
      Today = "Saturday";
    } else if (dayOfWeek == 7) {
      Today = "Sunday";
    }
    if (dayOfWeek < 6) {
      System.out.println(Today + " is a weekday");//3 = wednesday, executed
    } else {
      System.out.println(Today + " is a weekend");
    }

    int month = 9;
    boolean isThirtyDay = month == 4 || month == 6 || month == 9 || month == 11;
    boolean isTwenthyEightDay = month == 2;
    boolean isThirtyOneDay = !isThirtyDay && !isTwenthyEightDay;

    if (isThirtyDay){
      System.out.println("This month has 30 days.");
    } else if (isTwenthyEightDay){
      System.out.println("This month has 28 days");
    } else if (isThirtyOneDay){
      System.out.println("This month has 31 days");
    }
  }
}