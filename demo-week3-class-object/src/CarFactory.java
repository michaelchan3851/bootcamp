public class CarFactory {
  
  //attributes ...

  public void changeColor(Car car, String color){ // non static method, need an object
    car.setColor(color);
  }
}
