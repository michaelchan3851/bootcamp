package com.bootcamp.week9;

/**
 * Hello world!
 *
 */
public class App {

    public static int add(int x, int y) { // App.add(1, 2)
        if (x > 1) {
            // let anotherMethod(x + y) -> 1
            return x + y + anotherMethod(x + y);
        }
        return x + anotherMethod(x + y);

    }

    public static int anotherMethod(int z) {
        return (z + 2) / 100;
    }

    public static int divide(int x, int y) { // App.add()
        return x / y;

    }

    public static void main(String[] args) {

    }
}
