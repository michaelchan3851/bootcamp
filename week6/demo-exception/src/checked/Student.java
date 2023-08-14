package checked;

public class Student {
  String name;

  public Student() {
  }

  public Student(String name) {
    this.name = name;
  }

  public void setName(String name) throws NameTooLongException {
    if (name.length() > 10)
      throw new NameTooLongException("Name is too long (>50)");
    this.name = name;
  }

  public static void main(String[] args) {
    Student student = new Student("John");
    try {
      // checked exception
      student.setName("Peter abc abc abc");// if exception, throw it to the caller
    } catch (NameTooLongException e) {
      System.out.println("Nothing happen"); //
    }

    Student student2 = new Student();
    // student2.name.length(); //null pointer, unchecked exception
  }
}
