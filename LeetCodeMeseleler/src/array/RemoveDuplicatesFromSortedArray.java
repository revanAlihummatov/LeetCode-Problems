package array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray rdfsa = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1, 1, 2};
        int result = rdfsa.removeDuplicates(nums);
        System.out.println(result);
    }

    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    int[] result = removeElement(nums, j - 1);
                    k = result.length;
                }
            }
        }
        return k;
    }

    public static int[] removeElement(int[] nums, int val) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            int[] newArr = new int[nums.length - 1];
            int newIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i != index) {
                    newArr[newIndex++] = nums[i];
                }
            }
            return newArr;
        }

        return nums;
    }

}
