public class Person { // template
    // class -> 文件
    // only one public class
    // Describle the person by attributes
    private int age;
    private char gender; // week 6 -> ENUM

    // setter
    public void setAge(int age) { //
        this.age = age;
    }

    // getter
    public int getAge() {
        return this.age; // this.age
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getGender() {
        return this.gender;
    }

    public static boolean isMale(char gender) { // belongs to class
        if (gender == 'F') {
            return false;
        }
        return true;
    }

    public boolean isMale() { // each object has this method
        if (this.gender == 'F') {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc"; // new an object in heap
        String s2 = new String("abcd");// new an object in heap
        String s3 = String.valueOf("abcd");// new an object in heap
        int a = 10;
        Boolean b = new Boolean("false");
        Boolean b2 = Boolean.valueOf("false");
        Boolean b3 = true; // auto-box // new an object in heap

        Person p = new Person(); // Produce empty person object with default value
        Person p2 = new Person(); // Produce empty person object with default value
        p.setAge(13);
        p.getAge();
        System.out.println(p.getAge());
        System.out.println(p.getGender());

        int age = 13;
        // Static vs non-static
        // static
        System.out.println(Person.isMale('F')); // -> False;
        p.setGender('M');
        System.out.println(p.isMale()); // true

        Computer computer = new Computer(); // Computer() -> empty constructor
        computer.setColor("RED");
        computer.setRam(128);
        computer.setWeight(2);

        Computer computer2 = new Computer("Yellow");
        computer2.getColor();
        computer2.setColor("Black");
        computer2.getColor(); // -> Black
        
    }
}
