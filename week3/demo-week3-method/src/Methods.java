public class Methods {

    public static void print() { // method name: print()
        System.out.println("Hello in print() method.");
    }

    // in(parameters參數)
    public static int sum(int a, int b) { // input + output
        // left int = return type
        // the int inside the bracket are parameters
        // int c = a + b;
        // return c;
        return a + b;
    }

    public static double subtract(int x, int y) { // implicit from int -> double
        return x - y; // execute x - y first, then return the result
    }

    public static void method2(String str) { // output
        if (str == null || "".equals(str)) { // null is not empty, empty -> ""
            return;
        }
        System.out.println("String=" + str);
    }

    public static double pi() {
        return 3.14159;
    }

    public static void main(String[] args) { // method name: main()
        String str = "hello";
        str = str + "world"; // append operation

        // Approach 1
        System.out.println("Hello in print() method.");
        // Approach 2: by method
        print(); // print "Hello in print() method"

        // Approach 1
        int x = 10;
        int y = 100;
        int m = x + y; // 110
        // Approach 2
        int z = sum(x, y); // z = 110
        int i = sum(1000, -30); // 970
        // int o = sum("hello", 123); it's not the same primitive with method, so that
        // is error.
        if (i == 970) {
            System.out.println("the sum is 970");
        }

        // call method2
        method2("hello"); // print String=hello
        method2("Github"); // print String=Github
        method2(""); // returned

        double circleArea = 5 * 5 * pi();
        System.out.println("circle area=" + circleArea);
    }
}