package car;
public class Car {
  //Instance Variables (Instance -> Object)
  // Member Variables
  private int noOfWheel; // 0
  private int capacity; // 0
  private String color; // null

  //Empty Constructor
  public Car(){
    this.noOfWheel = 0;
    this.capacity = 0;
    this.color = null;
  }

  //All-arguements constructor (with all attributes)
  public Car(int noOfWheel, int capacity, String color){
    this.noOfWheel = noOfWheel;
    this.capacity = capacity;
    this.color = color;
  }

  public void setNoOfWheel(int noOfWheel){
    this.noOfWheel = noOfWheel;
  }
  public int getNoOfWheel(){
    return this.noOfWheel;
  }

  public void setCapacity(int capacity){
    this.capacity = capacity;
  }
  public int getCapacity(){
    return this.capacity;
  }

  public void setColor(String color){
    this.color = color;
  }
  public String getColor(){
    return this.color;
  }



  
  public static void main(String[]args){
    Car car = new Car();

  }
}
