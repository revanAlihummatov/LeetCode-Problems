package array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] digits = {9};
        System.out.println(Arrays.toString(po.plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1] == 9){
            long number = 0L;
            long val = 1L;
            for (int i = digits.length - 1; i >= 0; i--) {
                if (i == digits.length - 1)
                    number += digits[i];
                else
                    number += val * digits[i];
                val = val * 10;
            }
            number++;
            int[] newDigits = new int[countDigits(number)];

            for (int i = newDigits.length - 1; i >= 0; i--) {
                newDigits[i] = (int) (number % 10);
                number /= 10;
            }
            return newDigits;
        }else {
            digits[digits.length-1] += 1;
            return digits;
        }

    }
    public static int countDigits(long n) {
        int count = 0;

        while (n != 0) {
            n /= 10;
            count++;
        }

        return count;
    }
}
