public class Persons {
  String name;
  int age;

  public Persons(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public boolean isElderly(){
    return this.age >= 65;
  }

}
