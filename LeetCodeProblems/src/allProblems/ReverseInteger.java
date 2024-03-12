package allProblems;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        int y = Math.abs(x);
        int reversedX = 0;
        for (int i = countDigits(y); i > 0; i--) {
            if (reversedX > (Integer.MAX_VALUE - y % 10) / 10) {
                return 0;
            }
            int val2 = (int) (Math.pow(10, countDigits(y)) / 10);
            reversedX += val2 * (y % 10);
            y /= 10;
        }

        return (x < 0) ? (-reversedX) : reversedX;
    }

    public static int countDigits(int i) {
        int count = 0;

        while (i != 0) {
            i /= 10;
            count++;
        }

        return count;
    }
}
