public class Ball {

  private Color color; // string -> "RE D", "RED", "red", " RE D"

  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Ball))
      return false;
    Ball ball = (Ball) o;
    return this.color == ball.color;
  }

  public static void main(String[] args) {
    Ball ball = new Ball(Color.RED);
    System.out.println(ball.getColor().name());

    // Color color = Color.BLUE;
    // System.out.println(color.gethexCode());

    // Object is topmost parent
    Object object = new Ball(Color.RED); // object is reference
    // Compile-time Class "Object" type check
    object.hashCode(); // reference presentation
    // Compile-time check if Object class has hashCode() method
    // Compile-time check if Ball class inherit Object

    // Run-time object variable stores an address, point a Ball objects in heap
    // Run-time determine if Class Ball has hashCode() method.
    // If no, then invoke Class Object hashCode()
    // If yes, invoke the Class Ball hashCode()

    // object = new Demo();
    Color color = ((Ball) object).getColor();// Compile-time type checking
    // Color extends Enum.class. Enum extends Object.
    Class<?> clas = color.getClass();
    System.out.println(clas.toString()); //class Color
    
    
    if(Color.BLUE instanceof Color){ //true
      System.out.println("Color.Blue is instance of Color"); 
    }

    if(Color.BLUE.getClass() == Color.class){ //true
      System.out.println("Color.Blue is instance of Color"); 
    }

    Object o = 1 - 'a'; // int
    System.out.println(o.getClass().getName()); //java.lang.Integer
    Object o2 = 'b';
    System.out.println(o2.getClass().getName()); //java.lang.Character
    Object o3 = new Ball(Color.GREEN);
    System.out.println(o3.getClass().getName()); //Ball

    System.out.println(o3.getClass().isEnum()); // false
    System.out.println(clas.isEnum());//true
    System.out.println(clas.isPrimitive());


  }
}
