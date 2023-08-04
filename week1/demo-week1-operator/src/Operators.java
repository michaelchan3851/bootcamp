public class Operators {
    public static void main(String[] args) {
        int a = 1;
        a = a + 1;// 2
        a = a - 2;// 0
        int b = 10 / 5;// 2
        b = b * 3 + 5; // 11
        System.out.println("a append b=" + a + b);// a append b 011P

        // + 1 Operations
        int x = 1;
        x = x + 1;
        x++; // means x = x + 1;
        ++x; // means x = x + 1;
        x += 1; // means x = x + 1;
        System.out.println("x=" + x); // x=5 line 11 to 14 performence is the same

        // -1 Operations
        int y = 10;
        y = y - 1;
        y--;
        --y;
        y -= 1;
        System.out.println("y=" + y);// y = 6

        //Other +,-,*,/
        int z = 4;
        z = z + 2;
        z += 2;
        int i = 6;
        i = i - 3;
        i -= 3;
        int w = 9;
        w = w * 3; //27
        w *= 3; //81
        int u = 81;
        u = u / 9; //9
        u /= 3; //3
        System.out.println("u=" + u);

        int integer = 12 % 5;//2
        int integer2 = 12;
        integer2 %= 5;//2
        System.out.println("integer2=" + integer2);

        // ++, --
        int m = 3;
        m++; // 4
        int preIncrement = ++m; // m+1 first , assignment later
        System.out.println("preIncrement=" + preIncrement);// 5
        int postIncrement = m++; // assign first, m+1 later
        System.out.println("postIncrement=" + postIncrement); //5
        System.out.println("m=" + m); //6

        int n = 4;
        n--; // 3
        int preIncrement2 = --n; //2
        System.out.println(preIncrement2);
        int postIncrement2 = n--; //2
        System.out.println(postIncrement2);
        System.out.println("n=" + n); //1

        //String +=
        String str = "hello";
        str += "world"; //hello world

        





    }
}