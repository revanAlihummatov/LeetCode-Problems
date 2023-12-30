package leetcodeMeseleler;

public class NumbersOfGoodPairs {
    public static void main(String[] args) {
        NumbersOfGoodPairs nogp = new NumbersOfGoodPairs();
        int[] nums = {1,2,3};
        System.out.println(nogp.numIdenticalPairs(nums));
    }
    public int numIdenticalPairs(int[] nums) {
        int numbers = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i > j) {
                    numbers++;
                }
            }
        }
        return numbers;
    }
}
