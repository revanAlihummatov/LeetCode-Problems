package allProblems;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count != 0 && s.charAt(i) == ' ') {
                break;
            } else if (s.charAt(i) == ' ') {
                continue;
            } else {
                count++;
            }
        }
        return count;
    }
}
