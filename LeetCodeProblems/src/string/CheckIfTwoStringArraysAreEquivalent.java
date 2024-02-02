package string;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for (String str : word1) {
            sb.append(str);
        }
        String result1 = sb.toString();
        StringBuilder sb1 = new StringBuilder();
        for (String str2 : word2) {
            sb1.append(str2);
        }
        String result2 = sb1.toString();
        if (result1.equals(result2)){
            return true;
        }
        return false;
    }
}
