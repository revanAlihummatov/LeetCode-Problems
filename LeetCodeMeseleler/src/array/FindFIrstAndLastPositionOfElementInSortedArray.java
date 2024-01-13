package array;

public class FindFIrstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        FindFIrstAndLastPositionOfElementInSortedArray ffalpoeisa = new FindFIrstAndLastPositionOfElementInSortedArray();
        int target = 3;
        int[] nums = {3,3,3};
        int[] result = ffalpoeisa.searchRange(nums,target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
    public int[] searchRange(int[] nums, int target) {
        boolean b = false;
        int[] arr = {-1,-1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (arr[0] == -1){
                    arr[0] = i;
                }
                arr[1] = i;

            }

        }
        if (b){
            if (arr[1] == 0){
                arr[1] = arr[0];
            }
            return arr;
        }


        return arr;
    }
}
