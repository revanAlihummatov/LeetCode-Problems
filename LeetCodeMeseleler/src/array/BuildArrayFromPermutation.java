package array;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        BuildArrayFromPermutation bAFP = new BuildArrayFromPermutation();
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(bAFP.buildArray(nums)));
    }
    public int[] buildArray(int[] nums) {
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[nums[i]];
        }
        return nums2;
    }
}
