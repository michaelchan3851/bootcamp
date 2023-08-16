public class House extends Building {

  double capacity;

  public House() {

  }

  public House(double capacity) {
    this.capacity = capacity;
  }

  public double getCapacity() {
    return this.capacity;
  }

  public void print() {
    System.out.println("I am House");
  }

  // Overloading
  public void print(String s) {
    System.out.println("Overloading ..." + s);
  }

  public void BuildingPrint() {
    super.print2();
  }

  public static void main(String[] args) {
    Building house = new House(); // I am House
    house.print();
  }
}
