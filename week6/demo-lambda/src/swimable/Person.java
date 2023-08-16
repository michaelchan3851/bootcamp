package swimable;
public class Person implements Swimable {
  String name;
  
  public Person(){
  }

  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "[Name" + this.name
        + "]";
  }

  @Override
  public void swim() {
    System.out.println("person is swimming");
  }

  public static void main(String[] args) {
    Person person = new Person();
    person.swim();

  }
}
