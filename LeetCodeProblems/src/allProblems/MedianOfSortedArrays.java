package allProblems;

import java.text.DecimalFormat;
import java.util.Arrays;

public class MedianOfSortedArrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{2, 1}, new int[]{3, 4}));
    }

    /*
     *Qeyd:Bu mənim həll etdiyim ilk "hard" məsələdir!
     * 1. Arrayları birləşdirmək
     * 2. Artan sıra ilə yazmaq
     * 3. Uzunluğunun tək və ya cüt olduğunu yoxlamaq (if, else)
     *    3.1. Təkdirsə uzunluğu 2-yə bölmək və Math.round tətbiq etmək, sonra bir azaldılmışıncısını qaytarmaq
     *    3.2. Cütdürsə uzunluğu 2-yə bölmək və bir azaldılmışıncısı ilə ədədi ortasını qaytarmaq
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums12 = new int[nums1.length + nums2.length];
        double number;
        for (int i = 0; i < nums1.length; i++) {
            nums12[i] = nums1[i];
        }
        int z = 0;
        for (int i = nums1.length; i < nums12.length; i++) {
            nums12[i] = nums2[z];
            z++;
        }
        bubbleSort(nums12);//mənim metodum
//        Arrays.sort(nums12);//Java metodu
        if (nums12.length % 2 == 0) {
            double length2 = (double) nums12.length / 2;
            number = (double) (nums12[(int) length2] + (nums12[(int) (length2 - 1)])) / 2;
        } else {
            double length2 = (double) nums12.length / 2;
            length2 = Math.round(length2);
            int length21 = (int) length2;
            number = nums12[length21 - 1];
        }
        return number;
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
