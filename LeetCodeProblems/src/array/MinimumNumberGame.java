package array;

import java.util.Arrays;

public class MinimumNumberGame {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberGame(new int[]{2, 7, 9, 6, 4, 6})));
    }

    public static int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        int alicesnumber, bobsnumber, index = 0;
        for (int i = 0; i <= nums.length; i++) {
            alicesnumber = findAndRemoveMinumumNumber(nums);
            bobsnumber = findAndRemoveMinumumNumber(nums);
            if (alicesnumber != Integer.MAX_VALUE && bobsnumber != Integer.MAX_VALUE){
                    arr[index++] = bobsnumber;
                    arr[index++] = alicesnumber;
            }
        }
        return arr;
    }

    public static int findAndRemoveMinumumNumber(int[] nums) {
        int minumumNumber = nums[0];
        int j1 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < minumumNumber){
                    minumumNumber = nums[j];
                    j1 = j;
                }
            }
        }
        nums[j1] = Integer.MAX_VALUE;
        return minumumNumber;
    }
}
