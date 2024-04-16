package array;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;
        int val = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                val++;
            } else {
                val = 1;
            }
            if (val <= 2){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
