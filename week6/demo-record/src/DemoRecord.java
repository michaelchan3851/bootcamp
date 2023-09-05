import java.util.HashSet;
import java.util.Set;

public class DemoRecord {

    public static void main(String[] args) {
        Person2 person = new Person2("John", 30);

        Person1 person1 = new Person1("John", 30);
        Person1 anotherPerson = new Person1("John", 30);

        System.out.println(person.getAge()); // 30
        System.out.println(person1.age()); // 30

        System.out.println(person.getName()); // John
        System.out.println(person1.name()); // John

        System.out.println(person1.equals(anotherPerson)); // true
        System.out.println(person1); // Person1[name=John, age=30]

        System.out.println(person1.hashCode() == anotherPerson.hashCode()); // true

        // HashMap, set -> equals(),hashCode
        Set<Person1> set = new HashSet<>();
        set.add(person1);
        System.out.println(set.add(anotherPerson)); // false
    }

}
