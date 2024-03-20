package array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();
        int m = 3;
        int n = 3;
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        msa.merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int z = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[z];
            z++;
        }
        //Arrays.sort(nums1);
        bubbleSort(nums1);
    }
    public static void bubbleSort(int[] arr) {
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    val = arr[j];
                    arr[j] = arr[i];
                    arr[i] = val;
                }
            }
        }
    }
}
