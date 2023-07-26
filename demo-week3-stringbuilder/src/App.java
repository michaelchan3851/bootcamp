import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello"); // Constructor
        // s -> address (reference)
        s.append(" World"); // append() is faster than "+" in String
        System.out.println(s); // Hello World
        System.out.println(s.toString()); // String -> "Hello" // getter
        s.append(1.3f);
        System.out.println(s.toString()); // Hello World1.3

        // Hello World1.3true4000
        System.out.println(s.append(true).append(4000L).length()); // 22

        String str = "  he llo";
        String[] strs = str.trim().replace('h', 'e').split(" ");
        System.out.println(Arrays.toString(strs)); // [ee, llo]
        System.out.println(strs.length); // 2

        StringBuilder s2 = new StringBuilder("start");
        // Approach 1
        System.out.println(s2.append('a').toString().charAt(3)); // r // return Type is the "KEY" learning point
        // Approach 2
        StringBuilder s3 = s2.append('a');
        String s4 = s3.toString();
        s4.charAt(3); // r

        // insert
        String s10 = "hello"; // how to insert a space between ll
        StringBuilder s11 = new StringBuilder("hello");
        s11.insert(3, ' '); // return StringBuilder
        System.out.println(s11); // hel lo

        s11.insert(0, "world ").append(" word"); // why don't we assign back to s11
        System.out.println(s11); // world hel lo word

        s11.deleteCharAt(3);
        System.out.println(s11.toString()); // "word hel lo word" without "l", StringBuilder -> String
        System.out.println(s11.append("abc"));// word hel lo wordabc

        Integer a = 10;
        System.out.println(a + 10); // 20
        // a = 10

        s11.setCharAt(4, 'J'); //void, can't print
        System.out.println(s11.toString()); // wordJhel lo wordabc

        String str0 = "Helloworld";
        System.out.println(str0.substring(4 +1));
    }
}
