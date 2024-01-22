package string;

public class CheckIfTheSentenceIsPanagram {
    public static void main(String[] args) {
        String sentence = "qertyuiopasdfghjklzxcvbnmsodsnbdfnsbdnonsb";
        System.out.println(checkIfPanagram(sentence));
    }

    public static boolean checkIfPanagram(String sentence) {
        boolean[] letterPresent = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            if ('a' <= currentChar && currentChar <= 'z') {
                letterPresent[currentChar - 'a'] = true;
            }
        }

        for (boolean isPresent : letterPresent) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}
