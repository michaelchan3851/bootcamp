public class Array3 {
  public static void addOne(int[]arr){ // arr -> object reference //Pass by reference (Pass by address value)
    // int[]res = new int[arr.length];
    for(int i=0; i< arr.length;i++){
      arr[i] = arr[i]+1;
    }
    // return res;
  }

  // All Wrapper Class + String -> Pass by Value
  public static String concat(String s1, String s2){ // Pass by value
    s1 = "hello";
    return s1 + s2;
  }

  public static void main(String[] args) {
    int []nums = new int[]{3, 4, 8};
    // int [] result = 
    addOne(nums); // [4, 5, 9]
    // nums -> 4,5,9
    for(int i = 0; i < nums.length; i++){
      System.out.println(nums[i]);
    }

    // Call concat
    String a = "abc";
    String b = "def";
    //concat(a, b);// hellodef
    String result = concat(a, b);
    // result = hellodef
     String result2 = a;
    // b = def
    System.out.println(concat(a, b));
    System.out.println(result2);

  }
}
