package hashTable;

import java.util.Arrays;

public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};
        System.out.println(Arrays.toString(findIntersectionValues(nums1, nums2)));
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] commonElements = new int[2];
        int val1 = 0, val2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            int nums[] = new int[nums2.length];
            for (int j = 0; j < nums2.length; j++) {
                if (!checkArray(nums,nums2[j])) {
                    nums[j] = nums2[j];
                    if (check(nums1[i], nums2[j])) {
                        val1++;
                    }
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            int nums[] = new int[nums1.length];
            for (int j = 0; j < nums1.length; j++) {
                if (!checkArray(nums,nums1[j])) {
                    nums[j] = nums1[j];
                    if (check(nums2[i], nums1[j])) {
                        val2++;
                    }
                }
            }
        }
        commonElements[0] = val1;
        commonElements[1] = val2;
        return commonElements;
    }

    public static boolean check(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkArray(int[] arr, int a) {
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                val++;
            }


        }
        if (val != 0) {
            return true;
        } else {
            return false;
        }
    }
}

