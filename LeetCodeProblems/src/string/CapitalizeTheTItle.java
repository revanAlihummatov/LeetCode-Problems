package string;

public class CapitalizeTheTItle {
    public static void main(String[] args) {
        String title = "i lOve leetcode";
        System.out.println(capitalizeTitle(title));
    }

    public static String capitalizeTitle(String title) {
        title = title.toLowerCase();
        if (2 < title.length() && title.charAt(2) != ' ' && 1 < title.length() && title.charAt(1) != ' ') {
            char charAt1 = title.charAt(0);
            char charAtUpperCase1 = Character.toUpperCase(charAt1);
            title = title.substring(0, 0) + charAtUpperCase1 + title.substring(0);
            title = removeCharAtIndex(title, 1);
        }
        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) == ' ') {
                if (i >= 0 && i < title.length() - 1) {
                    if (i + 2 < title.length() && title.charAt(i + 2) != ' ' && i + 3 < title.length() && title.charAt(i + 3) != ' ') {

                        char charAtIndex = title.charAt(i + 1);
                        char charToUpperCase = Character.toUpperCase(charAtIndex);
                        title = title.substring(0, i + 1) + charToUpperCase + title.substring(i + 2);
                    }

                }

            }

        }
        return title;
    }

    public static String removeCharAtIndex(String str, int indexToRemove) {
        if (indexToRemove < 0 || indexToRemove >= str.length()) {
            return str;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i != indexToRemove) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
