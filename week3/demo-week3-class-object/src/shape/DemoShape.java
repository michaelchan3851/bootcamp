package shape;

public class DemoShape {
  public static void main(String[] args) {
    Square s1 = Square.of(10);
    Square s2 = Square.of(4);
    Square s3 = Square.of(5.0f);

    
    // s1 -> edges[0] color -> YELLOW
    s1.modify(4,"Yellow"); // address -> arrays -> this.color "String"
    System.out.println(s1.getEdges(4).getColor()); // YELLOW
    

    // getEdges() has 4 address, getEdges()[0] -> 1 address
    // s1.getEdges()[5].getColor();
    
  }
}


