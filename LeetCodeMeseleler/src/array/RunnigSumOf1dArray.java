package array;

import java.util.Arrays;

public class RunnigSumOf1dArray {
    public static void main(String[] args) {
        RunnigSumOf1dArray runnigSumOf1dArray = new RunnigSumOf1dArray();
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runnigSumOf1dArray.runningSum(nums)));
    }
    public int[] runningSum(int[] nums) {
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int val = 0;
            for (int j = i; j >= 0; j--) {
                val = val + nums[j];
            }
            nums2[i] = val;
        }
        return nums2;
    }
}
