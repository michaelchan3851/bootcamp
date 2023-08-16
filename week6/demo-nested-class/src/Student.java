//Outer Class
//Can Access static nested class attribute

import java.util.List;

public class Student {
  private String name;
  // constructor, getter, setter, static method & variable
  private Bag bag;
  // Grade grade

  public Student(String name) {
    this.name = name;
    bag = new Student.Bag();
  }

  // method -> Bag.method, instance variable
  public int getBagSize() {
    return this.bag.size;
  }

  public void clearBag() {
    // Outer Class access "Static nested class" static method
    Bag.clear(this.bag);
  }

  public static int add(int a, int b) {
    return a + b;
  }

  @Override
  public String toString() {
    return "Student[name=" + this.name
        + ", Grade[" + this.bag + "]" //
        + "]";
  }

  public String getName() {
    return this.name;
  }

  // Static nested class
  // Cannot Access Outer Class Attribute
  private static class Bag {
    int size;
    List<String> strings;

    // constructor
    // getter,setter
    // static method & variable
    public static void clear(Bag bag) {
      bag.strings.clear();
      // add(1+3); compile-error
    }

    // public void printStudentGrade(){
    // System.out.println(Grade.this.getGrade());
    // }

    public static void printHello() {
      Grade.printHello();
    }

    @Override
    public String toString() {
      return "Bag[name=" + this.size
          + ", strings=" + this.strings
          + "]";
    }

  }

  // Inner class (non-static nested class)
  private class Grade {
    int score;

    public int getScore() {
      return this.score;
    }

    public Grade(int score) {
      this.score = score;
    }

    // isMale()
    // isElderly()
    public char getGrade() {
      switch (this.score) {
        case 90:
          return 'A';
        case 80:
          return 'B';
        case 70:
          return 'C';
        default:
          return 'F';
      }
    }

    public void printStudentName() {
      System.out.println(Student.this.getName());
    }

    public static void printHello() {
      System.out.println("Hello");
    }

  }

  public static void main(String[] args) {
    Student student = new Student("John"); // Student's constructor
    Student.Bag bag = new Student.Bag(); // Bag's constructor

    System.out.println(student.toString()); // name, bag
    Student.Grade grade = student.new Grade(70);
    grade.printStudentName();// John

  }
}
