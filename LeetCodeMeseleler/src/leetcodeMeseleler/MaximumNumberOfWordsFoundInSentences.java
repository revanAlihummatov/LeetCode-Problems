package leetcodeMeseleler;

import java.util.Arrays;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        MaximumNumberOfWordsFoundInSentences maximumNumberOfWordsFoundInSentences = new MaximumNumberOfWordsFoundInSentences();
        String[] sentences = {"alice and bob love leetcode", "i think so too",
                "this is great thanks very much"};
        System.out.println(maximumNumberOfWordsFoundInSentences.mostWordsFound(sentences));
    }

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int val = 1;
            int harfSayisi = Arrays.stream(sentences).mapToInt(String::length).sum();
            for (int j = 0; j < harfSayisi; j++) {

                char lastChar = sentences[i].charAt(sentences[i].length() - 1);
                sentences[i] = removeLastCharacter(sentences[i]);
                if (lastChar == ' ') {
                    val++;


                }
                if (sentences[i].length() == 0) {
                    break;
                }
            }
            if (val > max) max = val;
        }
        return max;
    }

    public static String removeLastCharacter(String str) {
        if (str != null && str.length() > 0) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }
}