public class Demo {
  public static void main(String[] args) {
    // Student.Bag bag = new Student();

    Phone phone = new Phone.Builder()//
        .color(Color.GREY) //
        .number("1234567") //
        .weight(3.7d) //
        .build();
    System.out.println(phone);
  }
}
