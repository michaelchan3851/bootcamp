import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {
  public static void main(String[] args) {
    // One Table(Persons) -> Many Records (where age > 60)
    // Test getFromDb
    System.out.println(getFromDb("Lau").toString());
    // result:[Person(name=Eric Lau), Person(name=Peter Lau)]

    System.out.println(getFromDb("Chan").toString());
    // result:[Person(name=John Chan)]

    System.out.println(getFullNames("Lau"));

    // flatMap()
    List<String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("Mainland");
    addresses.add("Japan");
    Person4 p1 = new Person4("Ann", addresses);

    List<String> addresses2 = new ArrayList<>();
    addresses2.add("Hong Kong");
    addresses2.add("Taiwan");
    addresses2.add("US");
    Person4 p2 = new Person4("Betty", addresses2);

    List<Person4> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    System.out.println(getAllAddresses(persons));
    // [Hong Kong, Mainland, Japan, Taiwan, US]
    // return all address List<String> from the List<Person>

    System.out.println(getAllName(persons));
    System.out.println(getAllAddresses2(persons));
    System.out.println(getAllAddressesCount(persons));
  }

  public static List<String> getAllAddresses(List<Person4> persons) {
    return persons.stream() //
        .flatMap(p -> p.getAddresses().stream())
        .collect(Collectors.toList()); // size 2 List<List<String>>
    //
  }

  public static long getAllAddressesCount(List<Person4> persons) {
    return persons.stream() //
        .flatMap(p -> p.getAddresses().stream())
        .distinct()
        .count()
        ;
    //
  }

  public static List<String> getAllAddresses2(List<Person4> persons) {
    // flatMap
    List<String> addresses = new ArrayList<>();
    for (Person4 p : persons) {
      for (String address : p.getAddresses()) {
        addresses.add(address);
      }
    }
    // map
    // List<List<String>> addressessLists = new ArrayList<>();
    // for (Person p : persons) {
    //   addressessLists.add(p.getAddresses());
    // }
    return addresses;
  }

  public static List<String> getAllName(List<Person4> persons) {
    return persons.stream()
        .map(p -> p.getName())
        .collect(Collectors.toList());
  }

    // filter + map
    public static List<String> getAllName2(String lastName) {
      List<Person4> persons = new ArrayList<>();
      persons.add(new Person4("John Chan"));
      persons.add(new Person4("Eric Lau"));
      persons.add(new Person4("Peter Lau"));
      List<String> names = new ArrayList<>();
      for (Person4 p : persons) {
        if (p.getName().endsWith(lastName)) {
          names.add(p.getName());
        }
      }
      return names;
    }

  public static List<String> getFullNames(String lastName) {
    // Call Database, and returned a List of Person
    // SQL -> filter by lastname (where last_name = lastName)
    List<Person4> persons = new ArrayList<>();
    persons.add(new Person4("John Chan"));
    persons.add(new Person4("Eric Lau"));
    persons.add(new Person4("Peter Lau"));
    // Stream last name = Lau
    return persons.stream() //
        .filter(p -> p.getName().endsWith(lastName)) // p means T (T -> Person)
        .map(p -> p.getName()) // Conversion : from List<Person> to List<String>
        .collect(Collectors.toList()); // return List<String>
  }

  public static List<Person4> getFromDb(String lastName) {
    // Call Database, and returned a List of Person
    // SQL -> filter by lastname (where last_name = lastName)
    List<Person4> persons = new ArrayList<>();
    persons.add(new Person4("John Chan"));
    persons.add(new Person4("Eric Lau"));
    persons.add(new Person4("Peter Lau"));
    // Stream, last name = Lau
    return persons.stream() //
        .filter(p -> p.getName().endsWith(lastName))
        .collect(Collectors.toList()); // List<Person>
  }
}
