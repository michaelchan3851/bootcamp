// Before Java 8
public interface Move extends BigMove{

  // No instance variables -> camlcase

  // Constant
  static final int MAX_SPEED = 10; // public

  // Java -> naming convention -> Camlcase
  // "noOfDay"

  // Behavior
  // void up(); // public abstract

  // void down(); // public abstract

  // void left(); // public abstract

  // void right(); // public abstract

  void jump();// public abstract

  // No method implementions

  // After Java 8, lambda, stream
  default void print(){//intance method, implicitly public
    System.out.println("I am Java 8 default method");
  } 

  static String concat(String a, String b){
    return a + b;
  }


  

}
