package sorting;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{2, 3, 1, 1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        /*HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
        in HashSet*/
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)){
                return true;
            }
            map.put(num,i);
        }
        return false;//in HashMap
    }
}
