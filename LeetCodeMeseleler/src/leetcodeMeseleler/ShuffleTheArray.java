package leetcodeMeseleler;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(shuffleTheArray.shuffle(nums, n)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] x = new int[n];
        int[] y = new int[n];
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i <= n - 1) {
                x[i] = nums[i];
            } else if (i > n - 1) {
                y[i - n] = nums[i];
            }
        }
        int j = 0;
        for (int i = 0; i < n; i++, j += 2) {
            nums2[j] = x[i];
            nums2[j+1] = y[i];
        }
        return nums2;
    }
}
