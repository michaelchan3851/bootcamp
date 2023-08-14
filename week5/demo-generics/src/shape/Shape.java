package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Shape{

  abstract double area(); // implicity public

  //public static double area(List<? extends Shape> shapes) {
  public static <T extends Shape> double area(List<T> shapes) {
    BigDecimal total = BigDecimal.ZERO;

    // Triangle newShape = new Triangle(/* specify triangle parameters */);

    // // Add the new shape to the list
    // shapes.add((T) newShape);
    // shapes.add(new Circle()); // compile- time check //not allowed

    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();

  }

  public static void main(String[] args) {
    // Polymorphism
    Shape shape = new Circle();// Polymorphism
    Shape shape2 = new Square();// Polymorphism
    List<Shape> shapes = new ArrayList<Shape>();
    shapes.add(new Circle());
    // shapes = new ArrayList<circle>(); // compile-error because it's not polymorphism

    List<? extends Shape> list = new ArrayList<Circle>();
    list = new ArrayList<Circle>(); // OK
    list = new ArrayList<Shape>(); // OK
    list = new ArrayList<Square>(); // OK
    //list.add(new Circle());// compile check refer to declaration
    for(Shape s: list){
      s.area();
    }

    List<Map<String, String>> list2 = new ArrayList<>();
    list2.add(new HashMap<>());

  }

}
