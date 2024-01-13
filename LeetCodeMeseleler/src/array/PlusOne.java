package array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(po.plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {
        long number = Integer.parseInt(Arrays.toString(digits).replaceAll("\\D", ""));
        number++;
        String numberString = String.valueOf(number);

        digits = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = numberString.charAt(i) - '0';
        }
        return digits;
    }
}
