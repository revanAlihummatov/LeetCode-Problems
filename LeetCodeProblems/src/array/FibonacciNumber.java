package array;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(2));
    }
    //Fibonacci numbers :0; 1; 1; 2; 3; 5; 8; 13; 21; 34; 55; 89
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            if (i == n) {
                return fib[i];
            }
        }
        return 0;
    }
}
