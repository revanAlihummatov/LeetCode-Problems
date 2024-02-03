package hashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceofTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};
        List<List<Integer>> result = findDifference(nums1, nums2);
        System.out.println(result);
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> num1 = new HashSet<>();
        Set<Integer> num2 = new HashSet<>();
        List<Integer> notInNums2 = new ArrayList<>();//from nums1
        List<Integer> notInNums1 = new ArrayList<>();//from nums2
        List<List<Integer>> result = new ArrayList<>();
        for (int num : nums1) {
            num1.add(num);
        }
        for (int num : nums2) {
            num2.add(num);
        }
        for (int num : num1) {
            if (!num2.contains(num)) {
                notInNums2.add(num);
            }
        }
        for (int num : num2) {
            if (!num1.contains(num)) {
                notInNums1.add(num);
            }
        }
        result.add(notInNums2);
        result.add(notInNums1);
        return result;
    }
}
