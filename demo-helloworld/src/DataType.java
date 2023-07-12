public class DataType {
  public static void main(String[]args){
    //Data type
    //number, Text
    //Declaration
    int num; // int is a way to declare a variable
    //from now on, you can only put integer to variable num.
    //-> Action: assignment
    num = 3; //from right to left 
    System.out.println("3");
    System.out.println(3);
    System.out.println(num);
    
    //Text
    //Declaration + assignment
    String str = "hello ";
    System.out.println(str);

    //String str2 = 1; //error
    //int num2 = "hello"; //error
    
    //Re-assignment
    num = 10;
  
    //floating point 
    // int num2 = 3.3; error,int can only store Integer
    double f = 1.03;
    double f2 = 1; //OK. will explain later

    //byte,short,long
    byte b = 5;
    System.out.println(b);
    byte b2 = 127;
    byte b3 = -128;
    System.out.println(b2+b3);
    //byte b2 = 128; //error, out of range
    //byte b3 = -129; //error out of range

    short s = -1555;
    System.out.println(s);

    long l = 400;
    System.out.println(l);

    long l2 = 1000;
    long l3 = 30L; //norm -> L, but not l
    System.out.println(l3);

    //floating point -double/float
    float f3 = 1.0000000000003f; //norm -> f,but not F
    double d4 = 23.9d;

    //char, value should be assigned by single quote''
    char gender = 'M';
    char s10 = ' ';
    // char empty  = ''; //error

    //boolean
    boolean isMale = true;
    boolean isSalaryGreaterThan1000 = true;
    boolean isValid = false;



    //initialization, means the 1st time of assignment
    int a10 = 0;//if you dont know the value, you can put assume to be 0
    //short a10 = 3;
    a10 = 100;
    System.out.println(a10);
    a10 = 80;

    //String + operation
    String str1 = "Hello";
    String str2 = " World!";
    String result = str1 + str2;
    System.out.println(result);
    System.out.println(str1 + str2);//something something2

    String result2 = "I'm" + " Michael";
    System.out.println(result + " " + result2);

    // 
    int a = 1 + 3;//4
    int b10 = 1 - 3; //-2
    int c10 = 2 - 80; //-78
    int i = 2 * 101; // 202
    int p = 10 / 3; //3 ** Don't divide 0 **
    int o = 10 % 3; //1 ,1 is reminder
    System.out.println(o); //1
    System.out.println(a10);
    
    String str3 = "abc" + 13;//default behaviour; convert 13 to String
    //abc13
    String str4 = "abc" + 'A'; //abcA //'A' -> String "A",abcA
    String str5 = "abcd" + true;
    System.out.println(str5);//abcdtrue

    //String str6 = 13 + 13; //error 13 not a string
    String str7 = "" + 13  + 13; //13 ->String "13", result:1313
    System.out.println(str7);

    //+ can use on string
    // - * / % only can use on number, like  byte ,int ,short ,long ,float ,double
    //boolean for true/false, char for text



  }
}
