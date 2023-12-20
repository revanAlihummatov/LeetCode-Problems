package leetcodeMeseleler;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {0,1,2,2,3,0,4,2};
        int value = 2;
        int result = removeElement.removeElement(nums, value);
        System.out.println(result);
    }

    public int removeElement(int[] nums, int val) {
        int valsay = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) valsay++;
        }
        int[] newNums = new int[nums.length-valsay];
        int k = newNums.length;
        int val2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                newNums[val2] = nums[i];
                val2++;
            }
        }
        val2 = 0;
        for (int i = 0; i < newNums.length; i++) {
            nums[val2] = newNums[val2];
            val2++;
        }
        return k;
    }
}
