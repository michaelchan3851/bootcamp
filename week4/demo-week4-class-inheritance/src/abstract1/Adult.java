package abstract1;
public abstract class Adult extends Person {
  // abstract class extends abstract class
  // implicitly "exnteds" abstract method

  
  public Adult(){
    super(); //new person
  }

  public abstract void read();

  public void eat(){
    System.out.println("I am Adult, eating");
  }
}
