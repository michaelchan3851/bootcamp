package shape;

public class Edge {
  private int id;
  private double length;
  private String color;
  

  public Edge(int id,double length, String color) {
    this.id = id;
    this.length = length;
    this.color = color;
  }

  public int getId() {
    return this.id;
  }

  // public static void resetId(){
  //   counter = 0;
  // }


  public void setColor(String color) {
      this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getLength(){
    return this.length;
  }
}
