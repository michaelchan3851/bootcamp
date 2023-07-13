public class Trainingloops {
  public static void main(String[]args){
    int sum = 0;
    int sumOddNumWithout5 = 0;
    for (int i = 0; i < 10; i++){
      if ( i % 2 == 1){
        sum += i;
      //System.out.println(sum);
      } //odd number
      if (1 % 2 == 1 && i != 5){
        sumOddNumWithout5 += i;
      }
      System.out.println("sum=" + sum);
      System.out.println("sumoddnumwithout=" + sumOddNumWithout5);
    } 
  }
}
