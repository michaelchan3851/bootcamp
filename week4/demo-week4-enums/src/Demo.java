public class Demo {
    public static void main(String[] args) {
        // enum
        // Finite number of members
        // Example 1:(Direction: LEFT, RIGHT, UP, DOWN)
        // Example 2:(Weekday: Monday, Tuesday ...)
        // Example 3:(Double Entry: Debit, Credit)
        // 2. Growth of enum elements (Change %)

        Direction east = Direction.EAST;

        System.out.println(Direction.EAST.name()); // EAST
        System.out.println(Direction.EAST.toString()); // EAST
        System.out.println(Direction.NORTH);

        Direction east = Direction.EAST; // TBC (heap)
        System.out.println(east == Direction.NORTH); // false
        System.out.println(east != Direction.NORTH); // true
        // == and != are checking the object reference

        // values() -> loop
        for (Direction d : Direction.values()) { // Direction.values() -> static method
            System.out.println(d.name());
        }

        System.out.println(Direction.EAST.ordinal()); // 0
        System.out.println(Direction.SOUTH.ordinal()); // 1
        System.out.println(Direction.WEST.ordinal()); // 2
        System.out.println(Direction.NORTH.ordinal()); // 3

        System.out.println(east.getDegree()); //90
        System.out.println(east.getDirection()); //E        
    }
}
