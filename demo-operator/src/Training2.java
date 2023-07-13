public class Training2 {
  public static void main(String[]args){
    int weather = 15;
    boolean isCold = weather <= 20;
    boolean isNornmal = (weather > 20 && weather < 40);
    boolean isHot = (weather > 40);

    if(isCold){
      System.out.println("The weather is cold.");
    } else if(isNornmal){
      System.out.println("The weather is nornmal.");
    } else if(isHot){
      System.out.println("The weather is hot.");
    }




  
    int number1 = 14;
    int number2 = 37;
    int number3 = 6;
    if(number1 > number2 && number1 > number3){
      System.out.println("number1 is the largest number.");
    } else if((number2 > number1 && number2 > number3)) {
      System.out.println("number2 is the largest number."); 
    } else{
      System.out.println("number3 is the largest number.");
    }
//

int year1 = 2009;
    boolean isLeapYear1 = year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0;
    // Program a condition to check if it is a leap year.
    // But should NOT print anything.
    if (isLeapYear1) {
      System.out.println("2009 is a leap year.");
    }
    int year2 = 2020;
    boolean isLeapYear2 = year2 % 4 == 0 && year2 % 100 != 0 || year2 % 400 == 0;
    // same as the above, but it will print out.
    if (isLeapYear2) {
      System.out.println("2020 is a leap year.");
    }
    int year3 = 2400;
    boolean isLeapYear3 = year3 % 4 == 0 && year3 % 100 != 0 || year3 % 400 == 0;
    if (isLeapYear3) {
      System.out.println("2400 is a leap year.");
    }
    // same as the above, but it will print out.
    int year5 = 2100;
    boolean isLeapYear5 = year5 % 4 == 0 && year5 % 100 != 0 || year5 % 400 == 0;
    if (isLeapYear5) {
      System.out.println("2100 is a leap year.");
    }
  }
}


