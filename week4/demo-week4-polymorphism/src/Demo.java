public class Demo {
    public static void main(String[] args) {
        // Dynamic Polymorphism (Run-time)
        Building building = new House(); //
        // Compile-time checks
        // building.getCapacity(); //compile error
        building.print(); // Compile time confirm you can call print() method
        // Run-time decide which print() is going to call
        // So, "building" variable call House's print() method
        building.print2(); // I am House
        building.print3(); // I am Building

        // Static Polymorphism (Compile-time)
        // Method Signature (method name + parameters)
        // Constructor
        House house = new House();
        house.print("hello");
        house.print();
        House house2 = new House(3.0d);
        house2.print("hello");
        house2.print();
        // House house3 = new House("String"); //Constructor not found
        // house2.print(3L); //method print(long) not found

        long l1 = Long.valueOf(1L); // wrapper -> unbox
        Long l3 = 3L; // wrapper class -> auto-box

        long l2 = 2; // upcasting
        int i2 = (int) 3l; // downcast
        // downcast (Run-time Polymorphism)
        //
        Object obj = new Container(); // explicit downcast
        if (obj instanceof Cube) {// true or false? false
            Cube cube = (Cube) obj;// downcast: Object -> cube
            System.out.println("obj is instance fo Cube");
        }

        Object obj2 = new Cube(); // explicit downcast
        if (obj instanceof Container) {// true or false? true
            Container container = (Container) obj;// downcast: Object -> Container
            System.out.println("obj is instance fo Container");
        }

        //
        Container obj3 = new Clone(); // explicit downcast
        // Cube cube2 = (Cube) obj3; // java.lang.ClassCastException
        // run-time exception: Run-time polymorphism

        Number number = Integer.valueOf(3);
        // Double d1 = (Double) number; // java.lang.ClassCastException

    }

}
