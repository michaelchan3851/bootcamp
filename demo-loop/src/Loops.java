public class Loops {
  public static void main(String[] args) {
    // For loop
    int a = 0;
    ++a;
    a++;
    // indepence expression ++a = a++
    for (int i = 0; i < 4; ++i) {// (initialization; condition; update)
      //(1. must include three item, 2. follow the sequence )
      System.out.println("i=" + i + ", Hello");
      // Logic Flow:
      // i = 0 -> 0 < 4, 1st Hello
      // ++i -> i = 1 -> 2 < 4, 2nd Hello
      // ++i -> i = 2 -> 3 < 4, 3rd Hello
      // ++i -> i = 3 -> 4 is NOT smaller than 4,exit loop, 4th Hello
    }

    for (int j = 6; j > 0; j--){
      System.out.println("j=" + j); // 6 times
    }

    for (int i = 0; i > -3 ; --i){
      System.out.println("Hello world");
    }

    for (int i = 0; i < 0; i++){//NOT applied, NOT executed
      System.out.println("v");
    }

    int max = 10;
    int count = 0;
    for (int i = 0; i < max; ++i){
      count += i; //0, 1 ... 9
      System.out.println(count); //45
    }
    //count=?

    //1. Sum up all odd numbers
    //2. Sum up all odd numbers, except 5
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
    //25
    // sumOddNumWithout5 = 20

    for (int i = 0; i < 5; ++i){
      System.out.println("hello");
      if (i > 2){
        break;
      }
    }
    // i = 0, hello
    // i = 1, hello
    // i = 2, hello
    // i = 3, hello
    // break;
    for (int i = 0; i < 5; ++i){
      System.out.println("GOOD");
      if (i == 3){
        break;
      }
    }

    for (int i = 0; i < 10; ++i){
      System.out.println("Well" + i++);
      if (i % 2 ==0){
        continue;
      }
    }

    
    

  }
}
