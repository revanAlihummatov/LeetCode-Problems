package dynamicPrograming;

public class StoneGame {
    public static void main(String[] args) {
        System.out.println(stoneGame(new int[]{3, 2, 10, 4}));
    }

    public static boolean stoneGame(int[] piles) {
        int alicesvalue = 0, bobsvalue = 0;
        for (int i = 0; i <= piles.length / 2; i++) {
            if (piles[0] >= piles[piles.length - 1]) {
                alicesvalue += piles[0];
                bobsvalue += piles[piles.length - 1];
            } else {
                alicesvalue += piles[piles.length - 1];
                bobsvalue += piles[0];
            }
            piles = removeElement(piles, 0);
            piles = removeElement(piles, piles.length - 1);
        }

        if (alicesvalue > bobsvalue) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] removeElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return arr;
        }

        int[] result = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }
}
