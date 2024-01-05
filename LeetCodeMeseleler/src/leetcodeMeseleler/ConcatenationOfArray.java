package leetcodeMeseleler;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        ConcatenationOfArray cOA = new ConcatenationOfArray();
        int[] nums = {1,2,1};
        int[] result = cOA.getConcatenation(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
    public int[] getConcatenation(int[] nums) {
        int[] newNums = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            newNums[i + nums.length] = nums[i];
        }
        return newNums;
    }
}
