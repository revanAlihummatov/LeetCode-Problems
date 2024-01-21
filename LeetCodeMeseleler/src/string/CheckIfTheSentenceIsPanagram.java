package string;

public class CheckIfTheSentenceIsPanagram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkPanagram(sentence));
    }

    public static boolean checkPanagram(String sentence) {
        int val = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'b' || sentence.charAt(i) == 'c' || sentence.charAt(i) == 'd' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'f' || sentence.charAt(i) == 'h' || sentence.charAt(i) == 's' || sentence.charAt(i) == 't' || sentence.charAt(i) == 'k' || sentence.charAt(i) == 'n' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'm' || sentence.charAt(i) == 'l' || sentence.charAt(i) == 'p' || sentence.charAt(i) == 'g' || sentence.charAt(i) == 'r' || sentence.charAt(i) == 'w' || sentence.charAt(i) == 'y' || sentence.charAt(i) == 'q' || sentence.charAt(i) == 'v' ||sentence.charAt(i) == 'o' || sentence.charAt(i) == 'j' || sentence.charAt(i) == 'x'){
                val++;
            }
            if (val == 28){
                return true;
            }
        }
        return false;
    }
}
