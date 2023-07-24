public class Trainingloops2 {
  public static void main(String[]args){
    //a=1, b=1,a+b= sum ->show result sum 
    //sum->b , , sum + a ->print result
    int a =1;
    int b =1;
    int sum = 0;
    for (int i = 0; i < 15 ; i++){
      sum = a + b;
      System.out.println(a);
      a = b;
      b = sum;
     
    }
  }
}
