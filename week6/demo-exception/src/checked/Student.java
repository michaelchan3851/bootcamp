package checked;

public class Student {
  String name;
  long pocketmoney;

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

  public void setPocketMoney(long pocketmoney) throws AmountZeroException {
    if (pocketmoney < 1)
      throw new AmountZeroException("Amount <= 0");
    this.pocketmoney = pocketmoney;
  }

  public static void main(String[] args) {
    Student student = new Student("John");
    try {
      // checked exception
      // int i = 10 / 0;
      student.setName("Peter");// if exception, throw it to the caller
      student.setPocketMoney(-3);
    } catch (NameTooLongException | AmountZeroException e) {
      System.out.println(e.getMessage()); //
      System.out.println("Student Setter Issue,message:" + e.getMessage());
    } catch (RuntimeException e) {
      System.out.println(e.getMessage()); // by zero
      // } catch (Exception e) {
      // System.out.println(e.getMessage()); // by zero
    } finally {
      System.out.println("finally");
    }

    Student student2 = new Student();
    // student2.name.length(); //null pointer, unchecked exception
  }
}
