package string;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
