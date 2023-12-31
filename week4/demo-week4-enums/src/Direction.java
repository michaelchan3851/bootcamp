public enum Direction { // special keyword since Java 1.5
  // 1. public class Direction extends Enum
  // 2. enum is final class
  // 3. enum entends object

  // 全局唯一, 4 objects (EAST , SOUTH, WEST, NORTH)
  // new Direction("EAST")
  EAST('E', 90), // object in heap 0
  SOUTH('S', 180), // 1
  WEST('S', 270), // 2
  NORTH('N', 360) // 3
  ;

  private char direction;
  private int degree;

  private Direction(char direction, int degree) {
    this.direction = direction;
    this.degree = degree;
  }

  public char getDirection(){
    return this.direction;
  }

  public int getDegree(){
    return this.degree;
  }

  public boolean isOppsite(Direction direction){
    return Math.abs(this.degree - direction.getDegree()) == 180;
  }


  //should not be have set method in enum

  public static void main(String[] args) {
    System.out.println(Direction.EAST.isOppsite(Direction.WEST));; //true
    System.out.println(Direction.WEST.isOppsite(Direction.EAST));; //true
    System.out.println(Direction.WEST.isOppsite(Direction.NORTH));; //false
    
  }

}