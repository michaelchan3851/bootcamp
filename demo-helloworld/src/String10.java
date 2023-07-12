public class String10 {
  public static void main(String[]args){
    String str = "I am happy, but raining";
    str = str + ".";
    System.out.println("str= " + str);//I am happy, but raining.
    
    //Method
    //Length()
    int i = str.length();// length(), tool to return the length of str
    System.out.println("i=" + i);//convert i to String "24 -> "i=24"

    System.out.println("Hello".length());//5

    //equals()
    String str1 = "abc";
    String str2 = "abcd";
    String str3 = "abc";
    boolean areTheyEqual = str1.equals(str2); //false
    boolean areTheyEqual2 = str1.equals(str3); // true
    boolean b4 = str2.equals(str1 + "d"); //false
    System.out.println(areTheyEqual);
    System.out.println(areTheyEqual2);
    System.out.println(b4);// true = abcd = abc+d

    //chatAt(2), find the char at index 2 of the string
    String str4 = "Helloworld";
    System.out.println(str4.charAt(2));
    //System.out.println(str4.charAt(20));index out of range: 20
    //index 0 of str4 -> 'h'
    //index 1 of str4 -> 'o'
    //no red line and it is bug


  }
}
