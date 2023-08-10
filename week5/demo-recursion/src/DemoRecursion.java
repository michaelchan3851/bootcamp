public class DemoRecursion {
    public static void main(String[] args) throws Exception {
        // algorithm -> algo
        System.out.println(sum(10));
        System.out.println(sum2(6));
        print(5);
    }

    // Question 1:
    // tail- recursion
    // k + (k-1) + (k -2) + ... +0
    public static int sum(int k) {
        if (k < 1) // base condition
            return k;
        return k + sum(k - 1);
        // 15, no return
        // 5 + 10, return
        // 4 + 6, return
        // 3 + 3, return
        // 2 + 1, return
        // 1 + 0, return
        // 0 < 1, return

        // public static int sum(int k) {
        // int sum = 0;
        // int add = k;
        // for (int i = 0; i < k; i++) {
        // sum += add--;
        // if (add == 0)
        // break;
        // }
        // return sum;
        // }
    }

    // Question 2:
    // tail- recursion
    // 0, 1, 1, 2, 3, 5, 8, 13 ... kth elements [0, 1, 2, 3 ...]
    // k = 6, return 8
    public static int sum2(int k) {
        if (k <= 1)// base condition
            return k;
        return sum2(k - 1) + sum2(k - 2); //pattern
    }

    // Question 3:
    // non-tail recursion
    // 3 2 1 1 2 3, k = 3
    public static void print(int k) {
        int i =0;
        if (k < 1)
            return;
        i++;
        System.out.print("step"+i + "=" +k + " "); // 3
        print(k - 1 ); //print(1)
        System.out.print("step"+i+ "=" +k + " "); // 3
    }
}
