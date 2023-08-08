package abstract1;
public class Student extends Adult {
  // Must implement abstract method

  public Student() {
    super(); // new student
  }

  // Must implement abstract method
  public void sleep() {
    System.out.println("I am student, sleeping");
  }

  public void read() {
    System.out.println("I am student, reading");
  }

  public static void main(String[] args) {
    Student student = new Student();
    student.sleep();//I am student, sleeping
    student.read();//I am student, reading
    student.run();//I am Person, running
    student.eat();//I am Adult, eating
    System.out.println(student.getAge()); // 0 student object -> Adult object -> person object


  }
}
