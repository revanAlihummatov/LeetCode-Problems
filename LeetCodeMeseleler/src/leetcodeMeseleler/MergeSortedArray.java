package leetcodeMeseleler;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();
        int m = 3;
        int n = 3;
        int[] nums1 = {0};
        int[] nums2 = {1};
        msa.merge(nums1,m,nums2,n);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums12 = new int[n + m];
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != 0){
                nums12[i] = nums1[i];
                j++;
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] != 0){
                nums12[j] = nums2[i];
                j++;
            }
        }
        Arrays.sort(nums12);
        nums1 = new int[nums12.length];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nums12[i];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
