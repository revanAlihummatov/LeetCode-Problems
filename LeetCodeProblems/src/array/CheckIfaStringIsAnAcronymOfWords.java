package array;

import java.util.ArrayList;
import java.util.List;

public class CheckIfaStringIsAnAcronymOfWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        System.out.println(isAcronym(words, "abc"));
    }
    public static boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()){
            return false;
        }
        int val = 0;
        String word;
        for (int i = 0; i < words.size(); i++) {
            word = words.get(i);
            char c = word.charAt(0);
            if (c == s.charAt(i)){
                val++;
            }
        }
        if (val == s.length()){
            return true;
        }
        return false;
    }
}
