package hashTable;

public class FindMaximumNumberOfStringPairs {
    public static void main(String[] args) {
        String[] words = {"ny", "gz", "yr", "kt", "qd", "yn", "zg", "ry", "tk", "dq"};
        System.out.println(maximumNumberOfStringPairs(words));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int val = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)){
                    val++;
                }
            }

        }
        return val;
    }


}
