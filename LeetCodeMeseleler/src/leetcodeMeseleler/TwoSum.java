package leetcodeMeseleler;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int nums[] = {3, 3};
        int target = 6;
        int[] result = ts.twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    if (i != j) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{0};
    }
}
