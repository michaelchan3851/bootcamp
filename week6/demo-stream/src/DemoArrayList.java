import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class DemoArrayList {
        public static void main(String[] args) {
                List<String> strings = new ArrayList<>();
                strings.add("abc");
                strings.add("ghi");
                strings.add("def");

                // for-each
                for (String s : strings) {
                        System.out.println(s);
                }
                // stream (Data Structure)
                Stream<String> streamStrings = strings.stream();
                // Filtering stream.filter
                streamStrings = streamStrings.filter(s -> s.startsWith("a")); // filter is put predicate, instead of
                                                                              // boolean
                // Stream.forEach
                streamStrings.forEach(s -> System.out.println(s)); // abc

                strings.stream() //
                                .filter(s -> s.endsWith("i")) //
                                .forEach(s -> System.out.println(s)); // ghi

                List<String> strings2 = strings.stream() //
                                .filter(s -> s.length() == 3)
                                .collect(Collectors.toList());
                // Arrays.asList(strings);
                System.out.println(strings2.size()); // 3

                List<Integer> lengths = strings2.stream() // List<Integer> -> Stream<String>
                                .filter(e -> e.startsWith("a") || e.startsWith("d")) // if else
                                .map(e -> e.length()) // Stream<String> -> Stream<Integer>
                                .collect(Collectors.toList()); // Stream<Integer> -> List<Integer>

                lengths.forEach(e -> System.out.println(e)); // 3 3

                strings2.stream()
                                .sorted((s1, s2) -> s2.compareTo(s1)) // descending order
                                .forEach(s -> System.out.println(s));

                // List<Integer> -> Stream<String> -> if else -> return boolean
                System.out.println(strings2.stream().anyMatch(e -> e.startsWith("a"))); // true

                if (strings2.stream().anyMatch(e -> e.startsWith("a"))) {
                        System.out.println("One of the elements starts with a");
                }

                // interminate operations of Stream:
                // filter(), map(), sorted(), anyMatch()

                // terminated operations of Stream:
                // collect(), forEach(), count()

                // Stream can only terminate once,
                // but it may have multiple interminate operations

                List<Persons> persons = Arrays.asList(new Persons("John", 30), new Persons("Mary", 25));
                // stream -> get all the names from persons
                persons.stream()
                                .map(s -> s.name)
                                .forEach(s -> System.out.println(s));// John Mary

                List<String> names = persons.stream()
                                .map(e -> {
                                        String word = "word ...";
                                        return e.getName() + word;
                                }) // Stream<String>
                                .collect(Collectors.toList());

                System.out.println(names.stream().filter(e -> e.startsWith("John")).count()); // 1

                // Stream static method
                Predicate<String> lengthFunc = e -> e.length() == 3;

                long l = Stream.of("abc", "def", "ghi", "abc")
                                .filter(lengthFunc)
                                .distinct() // remove duplicate element;
                                .count();
                System.out.println(l); // 3

                List<Integer> integers = Stream.of(1, 2, 3, 4)
                                // .filter(e -> e ==2) //
                                .map(e -> { // the map reason of collect
                                        System.out.println("map=" + e); // if .filter(e -> e ==2) //2
                                        // why? //interminate operation
                                        return 2;
                                })//
                                  // .forEach(e -> System.out.println(e)); //2
                                .collect(Collectors.toList());

                System.out.println(integers);
                // .count(); //terminate operation

                int setSize = Stream.of(1, 2, 3, 3) //
                                .collect(Collectors.toSet()).size();
                System.out.println(setSize); // 3

                Stream.of(1, 2, 3, 3, 5) //
                                .filter(e -> e < 6 && e > 2)
                                .forEach(e -> System.out.println(e)); // 3 3 5

                List<String> animals = Arrays.asList("lion", "tiger", "bear");
                Map<String, Integer> animalMap = animals.stream()
                                .collect(Collectors.toMap(str -> str, str -> str.length()));
                // (key)(String -> return String), (elements)(Integer)(String -> str.length())

                // Loop Map
                for (Map.Entry<String, Integer> entry : animalMap.entrySet()) {
                        System.out.println(entry.getKey() + " " + entry.getValue());
                }

                //Stream.iterate()
                Stream.iterate(1, n -> n + 2)
                .limit(10) //
                .forEach(e -> System.out.println(e));
        }

        public static boolean find(List<Persons> persons) {
                return persons.stream() // stream<>
                                .filter(e -> e.isElderly()) // Stream<Person> -> if else
                                .findFirst() // Optional<Person>
                                .isPresent(); // boolean
        }
}
