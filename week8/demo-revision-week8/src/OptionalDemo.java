import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
  public static void main(String[] args) {
    List<String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("Mainland");
    addresses.add("Japan");
    Person p1 = new Person("Ann Chan", addresses);

    List<String> addresses2 = new ArrayList<>();
    addresses2.add("Hong Kong");
    addresses2.add("Taiwan");
    addresses2.add("US");
    Person p2 = new Person("Betty Chen", addresses2);

    List<Person> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    System.out.println(getFromDb(persons, "Chan")); // true
    System.out.println(getFromDb(persons, "Lau")); // false

    Optional<Person> result = getFromDb2(persons, "Chan");
    result.ifPresent(person -> {
      // System.out.println(p.getName);
      person.getAddresses().stream()
          .forEach(addr -> {
            System.out.println(addr);
          });
    });
  }

  public static Optional<Person> getFromDb2(List<Person> persons //
      , String lastName) {
    return persons.stream()//
        .filter(p -> p.getName().endsWith(lastName)) // Stream
        .findAny() // Optional<Person>
    ;
  }

  public static boolean getFromDb(List<Person> persons //
      , String lastName) {
    return persons.stream()//
        .filter(p -> p.getName().endsWith(lastName)) // Stream
        .findAny() // Optional<Person>
        .isPresent() // Optional<Person> -> boolean
    ;
  }
}
