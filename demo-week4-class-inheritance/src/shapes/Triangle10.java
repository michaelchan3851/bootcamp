package shapes;

public class Triangle10 extends Shape {
  
  private double height;
  private double length;

  public Triangle10(double height, double length){
    this.height = height;
    this.length = length;
  }

  @Override
  public double area(){
    return (this.height * this.length) /2;
  }
}
