import java.util.List;

public class Person {
  private String name;
  private List<String> addresses;

  public Person(String name) {
    this.name = name;
  }
  
  public Person(String name, List<String> addresses) {
    this.name = name;
    this.addresses = addresses;
  }



  public String getName() {
    return this.name;
  }

  public List<String> getAddresses() {
    return this.addresses;
  }

  @Override
  public String toString() {
    return "Person(name=" + this.name //
        + ", addressess=" + this.addresses //
        + ")";
  }
}
