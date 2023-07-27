package shape;
import java.util.Arrays;
public class Circle {

  private int id; // instance variable/ attribute
  private double radius;

  // static -> shared variable
  // final -> one time initialization ONLY
  public static final double pi = 3.14159; // static variable // class variable
  // "final" can't be reassign

  private static int counter;
  // calculate the number of circle objects being created

  public Circle() {
    this.id = counter;
     AddCounter();
  }

  public int getId(){
    return this.id;
  }

  public static void AddCounter(){
    counter++;
  }

  private int getCounter() { // calculate the number of circle objects being created
    return ++counter;
  }

  public double area() {
    return Math.pow(radius, 2) * pi;
  }

  public double circumference() { // instance method
    return 2 * this.radius * pi;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public static void main(String[] args) {
    Circle c = new Circle(); // Constructor
    // circle.radius = 1;
    c.setRadius(2);
    c.area();
    c.circumference();

    Circle c2 = new Circle(); // Constructor
    c2.setRadius(2);
    c2.area();
    c2.circumference();

  }
}
