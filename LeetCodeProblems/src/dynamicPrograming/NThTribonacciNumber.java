package dynamicPrograming;

public class NThTribonacciNumber {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }
//Tribonacci numbers : 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504, 927, 1705, 3136, 5768, 10609, 19513
    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        }
        int[] trib = new int[n + 1];
        trib[0] = 0;
        trib[1] = 1;
        trib[2] = 1;
        for (int i = 3; i <= n; i++) {
            trib[i] = trib[i - 1] + trib[i - 2] + trib[i - 3];
            if (i == n) {
                return trib[i];
            }
        }
        return 0;
    }
}
