package string;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int val = 0;

        for (String word : words) {
            if (isConsistent(word, allowed)) {
                val++;
            }
        }
        return val;
    }
    
    public static boolean isConsistent(String str, String allowed) {
        for (char c : str.toCharArray()) {
            if (allowed.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

}
