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
    student.sleep();
    student.read();
    student.run();
    student.eat();
    System.out.println(student.getAge()); // 0 student object -> Adult object -> person object
  }
}
