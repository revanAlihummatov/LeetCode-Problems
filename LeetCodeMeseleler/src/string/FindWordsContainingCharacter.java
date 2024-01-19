package string;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        FindWordsContainingCharacter findWordsContainingCharacter = new FindWordsContainingCharacter();
        String[] words = {"leet","code"};
        char x = 'e';
        List<Integer> list = findWordsContainingCharacter.findWordsContaining(words,x);
        for (Integer num : list) {
            System.out.println(num);
        }
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    nums.add(i);
                    break;
                }
            }
        }
        return nums;
    }
}
