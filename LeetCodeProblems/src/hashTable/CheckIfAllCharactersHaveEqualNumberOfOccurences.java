package hashTable;

public class CheckIfAllCharactersHaveEqualNumberOfOccurences {
    public static void main(String[] args) {
        String s = "zpfupfkmsuistzmtkijj";
        System.out.println(areOccurrencesEqual(s));
    }

    public static boolean areOccurrencesEqual(String s) {
        int[] arr = new int[s.length()];
        boolean[] arrb = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int val = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    val++;
                }
            }
            arr[i] = val;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)arr = removeElement(arr,i);
        }
        if (check(arr)){
            return true;
        }
        return false;
    }
    public static int[] removeElement(int[] array, int elementToRemove) {
        boolean elementFound = false;
        for (int element : array) {
            if (element == elementToRemove) {
                elementFound = true;
                break;
            }
        }
        if (!elementFound || array.length == 0) {
            return array;
        }

        int[] newArray = new int[array.length - 1];
        int index = 0;
        for (int element : array) {
            if (element != elementToRemove) {
                newArray[index++] = element;
            }
        }

        return newArray;
    }
    public static boolean check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
