public class Demo {
  public static void main(String[] args) {
    Car car = new Car(); // empty constructor
    Car car2 = new Car(4, 7, "RED");
    // print car2
    System.out.println(car2.getNoOfWheel()); // sysout
    System.out.println(car2.getCapacity());
    System.out.println(car2.getColor()); // RED

    // car2 = new Car(5,10,"Yellow"); // later
    car2.setColor("YELLOW"); // car -> object reference, storing the object reference
    car.setColor("BLUE");
    // car2 -> YELLOW
    // car -> BLUE
    System.out.println(car2); // Object reference storing object address in Stack -> Car@6b95977

    car2 = new Car(3, 4, "Black"); // ????
    car2 = null;
    car2 = new Car(10, 3, "Pink");
    System.out.println(car2);

    int[] arr = new int[] { 1, 3, 2 };
    //
    Integer sum = 0; // sum -> reference, an object contains 0
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i]; //
    }

    CarFactory carFactory = new CarFactory();
    carFactory.changeColor(car2, "WHITE");
    System.out.println(car2.getColor());// white

    // int[] arr = new int[3];
    // System.out.println(arr); //[I@7e9e5f8a

    Person person = new Person(); // Construtor
    Computer computer = new Computer();
    String str = new String("Hello"); // str -> object reference
    str.charAt(1);
    System.out.println(str); // Hello

  }
}
