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

  }
}


