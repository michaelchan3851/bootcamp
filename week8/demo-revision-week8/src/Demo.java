import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        // Stream support List, Map, Arrays.stream

        List<String> strings = new LinkedList<>();
        strings.add("abc");
        strings.add("defijk");
        strings.stream()
                .filter(e -> e.startsWith("a"))
                .forEach(e -> System.out.println(e)); // abc

        strings.stream()
                .map(e -> e.length()) // convert string to int
                .filter(l -> l < 5)
                .forEach(e -> System.out.println(e)); // 3

        Integer i = 1000;
        Integer j = 1000;
        System.out.println(i.equals(j)); // true

        i = 1000;
        j = 1000;
        System.out.println(i == j); // false , should be true

        String s1 = "abc"; // new String ("abc")
        String s2 = "abc"; // String literal pool
        System.out.println(s1 == s2); // true
        String s3 = s2;
        System.out.println(s3 == s1); // true
        s1 = s1 + "d"; // String is immutable, new String ("abcd")
        System.out.println(s1);

        Integer a = 129; // object 1 (129)
        System.out.println("a hashcode=" + System.identityHashCode(a)); // 1309552426
        a = a + 1; //Cannot revise the value of the object.Integer is immutable
        System.out.println("a hashcode=" + System.identityHashCode(a)); // 1311053135 //reference change
        int b = 127;
        int c = 127;
        Integer a2 = Integer.valueOf(129); // object 2, out of the range, new object
        Integer a3 = Integer.valueOf(127); // object 3, within the range -128 - 127
        Integer a4 = Integer.valueOf(127); // object 3, within the range -128 - 127
        Integer a5 = Integer.valueOf(127); // object 3, within the range -128 - 127
        Integer a6 = new Integer(127); // object 4, new object
        System.out.println("b hashcode=" + System.identityHashCode(b)); // 107577802
        System.out.println("c hashcode=" + System.identityHashCode(c)); // 107577802
        System.out.println("a2 hashcode=" + System.identityHashCode(a2)); // 2018699554
        System.out.println("a3 hashcode=" + System.identityHashCode(a3)); /// 107577802
        System.out.println("a4 hashcode=" + System.identityHashCode(a4)); // 107577802
        System.out.println("a6 hashcode=" + System.identityHashCode(a6)); // 1311053135

    }

    public static List<Integer> getAges(List<String> list) {
        return list.stream()
                .map(e -> e.length()) // convert string to int
                .filter(e -> e < 5)
                .collect(Collectors.toList());
                
    }
}