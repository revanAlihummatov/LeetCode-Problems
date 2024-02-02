package hashTable;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int[] newnums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] == nums[j]) {
                        newnums[i] = 0;
                        break;
                    } else {
                        newnums[i] = nums[i];
                    }
                }


            }

        }
        for (int i = 0; i < newnums.length; i++) {
            sum = sum + newnums[i];
        }
        return sum;
    }
}
