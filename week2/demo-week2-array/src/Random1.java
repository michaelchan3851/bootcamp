import java.util.Random;

import javax.swing.event.SwingPropertyChangeSupport;

public class Random1 {
  public static void main(String[] args) {
    int num = new Random().nextInt(3);// 0,1,2
    System.out.println(num);

    // 1 - 3 ?
    // if(num == 0){
    // num= 3;
    // System.out.println(num);
    // }else{
    // System.out.println(num);
    // }
    int num2 = new Random().nextInt(3) + 1;// 1, 2, 3
    System.out.println(num2);
    System.out.println(randomAbcd());
  }

  // A,B,C,D,E
  public static char randomAbcd() {
    // Approach 1:
    // char [] chars = new char[]{'A','B','C','D','E'};
    // return chars[new Random().nextInt(5)];
    // Approach 2:
    return (char) (new Random().nextInt(5) + 65);
  }

  
}
