import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
  public static void main(String[] args) {
    List<String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("Mainland");
    addresses.add("Japan");
    Person4 p1 = new Person4("Ann Chan", addresses);

    List<String> addresses2 = new ArrayList<>();
    addresses2.add("Hong Kong");
    addresses2.add("Taiwan");
    addresses2.add("US");
    Person4 p2 = new Person4("Betty Chen", addresses2);

    List<Person4> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    System.out.println(getFromDb(persons, "Chan")); // true
    System.out.println(getFromDb(persons, "Lau")); // false

    Optional<Person4> result = getFromDb2(persons, "Chan");
    result.ifPresent(person -> {
      // System.out.println(p.getName);
      person.getAddresses().stream()
          .forEach(addr -> {
            System.out.println(addr);
          });
    });
  }

  public static Optional<Person4> getFromDb2(List<Person4> persons //
      , String lastName) {
    return persons.stream()//
        .filter(p -> p.getName().endsWith(lastName)) // Stream
        .findAny() // Optional<Person>
    ;
  }

  public static boolean getFromDb(List<Person4> persons //
      , String lastName) {
    return persons.stream()//
        .filter(p -> p.getName().endsWith(lastName)) // Stream
        .findAny() // Optional<Person>
        .isPresent() // Optional<Person> -> boolean
    ;
  }
}
