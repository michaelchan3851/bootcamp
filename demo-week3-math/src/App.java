import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(Math.round(5.4d)); // result: 5.0
        System.out.println(Math.round(5.5)); // result: 6
        System.out.println(Math.round(5.44)); // result: 5.0
        System.out.println(Math.round(5.45)); // result: 5.0

        System.out.println(Math.sqrt(26)); // result return double 5.0990195135927845
        System.out.println(Math.sqrt(-26));// NaN

        int num = -25;
        if (num > 0 && Math.sqrt(num) == 5) { // if num <= 0, exit and won't check right hand side
            // do somthing
        }

        Math.random(); // 0.0 - 1.0 , or you can times by yourself or use some cal

        // base10
        // log10 -> 1
        // log1000 -> 3
        // 10^3
        // base 2:
        // log8 -> 3
        // 2^3
        double k = Math.pow(2, 3);
        // 2^3
        System.out.println(k); //8

        double number = 10.0d;
        double naturallog = Math.log(number);
        System.out.println(naturallog);//2.302585092994046

        System.out.println(Math.log10(1000)); // 3.0

        int[] nums = new int[] { -100, 100, 90, 50 };
        // -100 -> 100
        // 100 + 100 + 90 + 50

        int sum = 0;
        for (int i = 0; i < nums.length; i++) { // 10 sec
            sum += Math.abs(nums[i]);
        }
        System.out.println("sum=" + sum);//sum=340

        // if java lang, would auto import
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) { // 10 sec
            // if (nums[i] < 0) {
            //     nums[i] = Math.abs(i);
            // }
            // sum1 += nums[i];

            sum1 += Math.abs(nums[i]);
        }
        System.out.println(sum1); //340

        double[] arr = new double[] { -5.64, 5.23, 9.800, 6.55 };
        long total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += Math.round(Math.abs(arr[i]));
            // total = total + Math.round(Math.abs(arr[i])); // downcasting explicit

        }
        System.out.println("total=" + total); //28

        int cubeLength = 3;
        double volume = Math.pow(cubeLength, 3);
        // or int volume2 = (int) Math.pow(cubeLength, 3);

        int[] bases = new int[] { 2, 3, 4, 5 };
        int[] index = new int[] { 3, 4, 5, 6 };
        int[] result = new int[ bases.length ];
        for (int i = 0; i < bases.length; i++) {
            result[i] = (int) Math.pow(bases[i], index[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}
