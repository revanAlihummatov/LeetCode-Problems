package array;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        HowManyNumbersAreSmallerThanTheCurrentNumber hMNASTTCN = new HowManyNumbersAreSmallerThanTheCurrentNumber();
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(hMNASTTCN.smallerNumbersThanCurrent(nums)));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int j = 0;
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums.length; k++) {
                if (nums[i] > nums[k]){
                    j++;
                    nums2[i] = j;

                }
            }
            j = 0;

        }
        return nums2;
    }
}
