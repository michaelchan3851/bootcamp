package shape;

public class Square {

  private Edge[] edges; // instance method

  // public Square() { // empty constructor
  // this.edges = new Edge[4]; // [null, null, null, null]
  // this.edges[0] = new Edge(3.0d, "RED");
  // this.edges[1] = new Edge(3.0d, "YELLOW");
  // this.edges[2] = new Edge(3.0d, "BLACK");
  // this.edges[3] = new Edge(3.0d, "BLUE");
  // }

  public Square(double length) {
    if (length <= 0)
      length = 1.0d;

    this.edges = new Edge[4]; // [null, null, null, null]
    this.edges[0] = new Edge(length, "RED");
    this.edges[1] = new Edge(length, "RED");
    this.edges[2] = new Edge(length, "RED");
    this.edges[3] = new Edge(length, "RED");
  }

  public Edge[] getEdges() {
    return this.edges;
  }

  public static void main(String[] args) {
    Square s1 = new Square(10);
    Square s2 = new Square(4);
    Square s3 = new Square(5);

    // s1 -> edges[0] color -> YELLOW
    s1.getEdges()[0].setColor("YELLOW"); // address -> arrays -> this.color "String"
    System.out.println(s1.getEdges()[0].getColor()); // YELLOW
  }
}
