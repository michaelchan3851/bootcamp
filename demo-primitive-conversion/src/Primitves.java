public class Primitves {
    public static void main(String[] args) {
        // Correct Syntax
        // Upcasting (Implicit conversion)
        // byte -> short -> int -> long -> float -> double
        byte b = 2;
        short s = b; // byte -> short, upcasting (promotion)
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        // char -> int
        char c = 'A';
        int j = c;

        // Downcasting
        double d2 = 10.3d;
        // float f2 = d2; // why error? double precision is larger than float
        float f2 = (float) d2; // developer take responsibilty for the risky

        short s2 = 128;
        // byte b2 = s2; error
        byte b2 = (byte) s2;
        System.out.println("b2=" + b2); // -128

        // for (byte k = 127; k < 129; k++) { // 128 -> -128
        // System.out.println("hello");
        // }

        // int[] arr = new int[Integer.MAX_VALUE];
        // for (int n = 0; n < arr.length; n++) {

        // }

        char c2 = 'B'; // 66, ASCII Code
        if (c2 == 'B') {
            System.out.println("c2 is 66");
        }
        if (c2 == 66) {
            System.out.println("c2 is 66");
        }
        char c3 = 67; // X downcast
        System.out.println(("char 67=" + c3));
        if (c3 == 'C') {
            System.out.println("c3 is C");
        }

        // ASCII (int) to char
        int g = 'a';
        int g2 = 10;
        char k = (char) g2;// Explicit conversion/ downcasting
        System.out.println(k);
        char k2 = 66; // 66 is ASCII code

        //
        int h = (int) 1000L; // downcasting, Explicit conversion
        short s10 = 128; // check within range
        byte o = (byte) s10; // if step 1 check datatype, step 2 忽略 data range
        // byte o2 = 128; //checked it is not within range // error

        char character = 'a' + 1;
        if (character == 'b') {
            System.out.println("character = " + character);
        }
        if (character == 98) {
            System.out.println("character = " + character);
        } // char can be add || subtract

        if (character > 'a') { // ASCII
            System.out.println("character > a");
        }

        // exam question will have overfloat!!!!!!
    }
}
