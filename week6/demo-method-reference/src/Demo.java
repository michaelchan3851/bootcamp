import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Consumer<String> sysout = s -> System.out.println(s);
        Consumer<String> sysout2 = System.out::println; // static method //no s ->

        Arrays.asList("abc", "def").forEach(sysout2);

        String name = "John";
        Supplier<Integer> strLength = () -> name.length(); // lambda
        Supplier<Integer> strLength2 = name::length; // instance method 

        List<String> words = Arrays.asList("apple", "banna", "orange");
        Comparator<String> compare = (s1, s2) -> s2.compareTo(s1);
        Comparator<String> compare2 = String::compareTo; // Object reference::method // instance method 

        Function<String,Integer> stringToInteger = str -> Integer.valueOf(str); //lambda
        Function<String,Integer> stringToInteger2 = Integer::new;
        // Constructor
        Function<String,Integer> stringToInteger3 = Integer::valueOf; 



    }
}