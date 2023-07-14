public class Day4Training {
  public static void main(String[]args){
    String star = "";
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        star += "*";
      }
      System.out.println(star);
      star = "";
    }
  }

}
