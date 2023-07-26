import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        // basic for-loop
        for (int i = 0; i < 3; i++) {
            System.out.println("hello");
        }
        // For each
        int[] arr = new int[] { 200, 100, 3, 4 };
        // for (Type element : Dataset)
        // Difference of for-each:
        // 1. for-each do not have stop condition/ counter in loop signature

        for (int x : arr) { // loop through all elements
            System.out.println("for-each: hello, x=" + x); // x = value, not the index
            System.out.println(arr[0]); // but you still access element by index
            // // modification
            arr[0] = 8; // read -> write
        }
        // {1, 4, 10, 13, 20 ,0}
        // 1, 0
        // 4, 20
        // 10 ,13
        for (int i = 0; i < arr.length; i++) { // counter
            if (i > arr.length / 2 - 1) {
                break;
            }
            System.out.println("for-each: hello");
            System.out.println("first=" + arr[i] + "last=" + arr[arr.length - i - 1]);
            arr[0] = 9;
        }

        // String arrays
        String[] strs = new String[] { "hello", "world" };
        for (String s : strs) {
            System.out.println(s);
        }

        // // Integer, Character (Wrapper Class)
        Character[] chars = new Character[] { 'L', 'a', '!', '(' };
        for (Character c : chars) {
            System.out.println(c);
        }

        String s2 = "Hello world ! I am Vincent";
        // String[] strings = s2.split(" "); // Use " " to split the String s2
        // for (String s : strings) {
        // System.out.println(s);
        // }
        // without using split, use a for loop to split s2
        // Output: String[]
        // 1. substring()

        for (int i = 0; i < s2.length(); i++) {
            if (s2.substring(i, i + 1).equals(" ")) {
                System.out.print("\n");
            } else {
                System.out.print(s2.substring(i, i + 1));
            }
        }

        // 2. to CharArray()
        int count = 0;
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < s2.length(); i++) {
            if (chars2[i] == ' ') {
                count++;
            }
        }

        String[] str = new String[count + 1];

        count = 0;
        int startindex = 0;
        for (int i = 0; i < chars2.length; i++) {
            if (chars2[i] == ' ') {
                str[startindex] = s2.substring(startindex, i);
                startindex = i + 1;
            } else if(i == chars2.length - 1) {
                str[startindex] = s2.substring(startindex, i + 1);
            }
        }
        //System.out.println(Arrays.toString(str));

        System.out.println(Arrays.toString(split(s2)));
    }

    public static String[] split(String s) {
        // Approach 1: substring()example
        // Count Spaces
        int spaceCount = 0;
        String str = s.trim();
        for (int i = 0; i < s.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int startindex = 0;
        int idx = 0;
        String[] result = new String[spaceCount + 1];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result[idx] = str.substring(startindex, i);
                idx++;
                startindex = i + 1;
            } else if (i == str.length() - 1) { // last character
                result[idx] = str.substring(startindex, str.length());
            }
        }
        System.out.println("result=" + Arrays.toString(result));
        return result;
    }
}