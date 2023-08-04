package shape;

public class Square {

  // private static int edgeCounter;
  private final Edge[] edges; // instance method

  // public Square() { // empty constructor
  // this.edges = new Edge[4]; // [null, null, null, null]
  // this.edges[0] = new Edge(3.0d, "RED");
  // this.edges[1] = new Edge(3.0d, "YELLOW");
  // this.edges[2] = new Edge(3.0d, "BLACK");
  // this.edges[3] = new Edge(3.0d, "BLUE");
  // }

  private Square(double length) {
    if (length <= 0)
      length = 1.0d;
    int id = 0;
    this.edges = new Edge[4]; // [null, null, null, null]
    this.edges[0] = new Edge(++id, length, "RED");
    this.edges[1] = new Edge(++id, length, "RED");
    this.edges[2] = new Edge(++id, length, "RED");
    this.edges[3] = new Edge(++id, length, "RED");
    // Square.resetId();
  }

  public static Square of(double length){
    return new Square(length);
  }

  public Edge getEdges(int edgeId) {
    return this.edges[edgeId - 1];
  }

  public void modify(double length) {
    this.edges[0].setLength(length);
    this.edges[1].setLength(length);
    this.edges[2].setLength(length);
    this.getEdges(3).setLength(length); // is the same
  }

  public void modify(String color) {
    this.edges[0].setColor(color);
    this.edges[1].setColor(color);
    this.edges[2].setColor(color);
    this.getEdges(3).setColor(color); // is the same
  }

    public void modify(int edgeId, String color){
      this.getEdges()[edgeId-1].setColor(color);
    }

    private Edge [] getEdges(){
      return this.edges;
    }
      // public void setEdges(Edge[] edges) { // final Edge[] edges, thus can't change
  // edge[]
  // this.edges = edges;
  // }

  // public static void resetId(){
  // edgeCounter = 0;
  // }
  
}