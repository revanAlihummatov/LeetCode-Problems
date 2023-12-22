package leetcodeMeseleler;

public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition sIP = new SearchInsertPosition();
        int[] nums = {2,5};
        int target = 1;
        System.out.println(sIP.searchInsert(nums,target));
    }
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }

        }
        if (target < nums[0]){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {

                if (nums[i] < target && target < nums[j]){
                    return j;
                }
            }
        }
        return nums.length;
    }
}
