public class Student extends Person 
implements Runnable, Swimable, Move { // class signature

  private String name;

  private int score;

  public int getScore(){
    return this.score;
  }


  @Override
  public void breath() {

  }

  @Override
  public void jump() {

  }


  // must be override and completed the method
  @Override
  public void run() {
    System.out.println("Student is running");
  }

  @Override
  public void swim() {
    System.out.println("Student is swimming");
  }

  public static void main(String[] args) {
    // MAX_SPEED;
    System.out.println(Move.MAX_SPEED); // 10

    Move student = new Student();
    student.up();
    student.down();
    student.left();
    student.right();
    // System.out.println(move.MAX_SPEED); //not recommend

    Dog dog = new Dog();
    dog.up();
    dog.down();
    dog.left();
    dog.right();
    

    System.out.println("score=" +dog.getScore());

    Swimable swimable = new Student();
    swimable.swim();

    Person person = new Student();
    person.breath();
    person.getAge();
  }
}
