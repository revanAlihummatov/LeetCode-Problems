package allProblems;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1000000001));
    }

    public static boolean isPalindrome(int x) {
        int y = reverse(x);
        if (x == y) {
            return true;
        }
        return false;
    }

    public static int reverse(int x) {
        int y = Math.abs(x);
        int reversedX = 0;
        for (int i = countDigits(y); i > 0; i--) {

            int val2 = (int) (Math.pow(10, countDigits(y)) / 10);
            reversedX += val2 * (y % 10);
            y /= 10;
        }

        return reversedX;
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
