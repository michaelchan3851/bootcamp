public class Trainingloops {
  public static void main(String[] args) {
  
    String star = "";

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        star += "*";
      }
      System.out.println(star);
      star = "";
    }

    for(int i = 0; i < 10; i++){
      System.out.println(i+1);
    }

    for(int i = 10; i > 0; i--){
      System.out.println(i);
    }

    for (int i = 0; i<= 10; i++){
      for (int j = 1; j <= 10; j++){
        System.out.print(i * j + "\t");
      }
      System.out.println(" ");
    }    


  }

}
