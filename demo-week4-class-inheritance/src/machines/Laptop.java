package machines;

import java.util.Objects;

public final class Laptop extends Machine {
  // Laptop is subclass (child), Machine is superclass (parent)
  // Inherit Machine attribute ("double weight")
  // Inherit Machine method (start() and stop())

  // double weight;
  private Keyboard keyboard;
  private Monitor monitor;
  private int volume;

  // subclass constructor must call one of superclass constructors

  // subclass must call superclass constructor

  public Laptop() {
    // super(); // new Machine();
    // implicitly call superclass empty constructor
    // new Machine()
  }

  public Laptop(Keyboard keyboard, Monitor monitor) {
    // implicitly call superclass empty constructor
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  public Laptop(String buttonType, int noOfButton,
      double length, double width) {
    // implicitly call superclass empty constructor
    this.keyboard = new Keyboard(buttonType, noOfButton);
    this.monitor = new Monitor(length, width);
  }

  public Laptop(double weight, Keyboard keyboard, Monitor monitor) {
    super(weight); // new Machine(5); //can't be last, super should be first
    // = super()+ this.setWeight(weigth);
    // super();
    // this.setWeight(weight);
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Laptop))
      return false;
    Laptop laptop = (Laptop) o;
    return Objects.equals(laptop.keyboard, this.keyboard)
        && Objects.equals(laptop.monitor, this.monitor);
  }

  @Override // Methdod Overriding
  public void start() {
    super.start(); // Machine Start...
    System.out.println("Laptop Start... ");
  }

  @Override // Methdod Overriding
  public void stop() { // Methdod Overriding
    System.out.println("Laptop Stop... ");
  }

  // You cannot override the final method in superclass
  // public static String staticMethod(String x, String y){
  // return x + y;
  // }

  public void mute() {
    this.volume = 0;
  }

  public static void main(String[] args) {
    Laptop laptop = new Laptop("abc", 100, 15, 10);
    laptop.setWeight(3.0d);
    System.out.println(laptop.getWeigth()); // 3.0);
    laptop.start();
    // machine start... (super())
    // Laptop start...

    laptop.stop(); // Laptop stop...

    Machine machine = new Machine(); // weight = 0.0
    machine.setWeight(5.0d);
    System.out.println(machine.getWeigth()); // 5.0
    machine.start(); // machine start...
    machine.stop(); // machine stop...

    Laptop laptop2 = new Laptop();
    laptop2.setWeight(10.0d);
    System.out.println(laptop2.getWeigth()); // 10.0

    Laptop laptop3 = new Laptop();
    System.out.println(laptop3.getWeigth());// 1.0
    System.out.println(Machine.staticMethod("abc", "def")); // abcdef
    System.out.println(Laptop.staticMethod("abc", "def"));// abcdef
    // laptop3.staticMethod("abc", "def"); //abcdef not recommended
  }

}
