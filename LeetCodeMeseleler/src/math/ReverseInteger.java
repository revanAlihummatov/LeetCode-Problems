package math;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = 1534236469;
        System.out.println(reverseInteger.reverse(x));
    }

    public int reverse(int x) {
        int reversedX = 0;
        int menfiormusbet = 1;

        if (x < 0) {
            menfiormusbet = -1;
        }

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            reversedX = reversedX * 10 + digit;
        }

        reversedX *= menfiormusbet;
        return reversedX;
    }
}
