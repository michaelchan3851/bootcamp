public class Student {
  // State / Instance Variables
  private String firstName;
  private String lastName;
  private int age;

  // All-arguments constructor -> new object (instance)
  public Student(String firstname, String lastname, int age) {
    this.firstName = firstname;
    this.lastName = lastname;
    this.age = age;
  }

  public String fullName() {
    return this.firstName.concat(" ").concat(this.lastName);
  }

  // Behaviors / Methods
  // public String getfirstName() {
  // return this.firstName;
  // }

  // public String getLastName() {
  // return this.lastName;
  // }

  public boolean isAdult() {
    // if (this.age >= 18)
    // return true;
    // return false;
    // return this.age >= 18 ? true : false;
    return this.age >= 18; // most elegant writing
  }

  // public static boolean isAdult(int age){
  //   return age >= 18;
  // }

  // public int getAge(){
  // return this.age;
  // }

  public void setfirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastname) {
    this.lastName = lastname;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }
}
