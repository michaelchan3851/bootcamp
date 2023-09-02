public class Student<T extends Number> {
  T data;

  // public class Student {
  // String data;
  public static void main(String[] args) {
    Student<Integer> student = new Student<>();
    student.getThing(2);
  }

  public T getData(){
    return this.data;
  }

  public static <T> T getThing(T data) {
    return data;
  }

}
