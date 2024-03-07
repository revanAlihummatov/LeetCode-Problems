package allProblems;

public class RomanToInteger13 {
    public static void main(String[] args) {
        String s = "XIX";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        final int i = 1, v = 5, x = 10, l = 50, c = 100, d = 500, m = 1000;
        int[] valArr = new int[s.length()];
        for (int j = 0; j < s.length(); j++) {
            String s2 = String.valueOf(s.charAt(j));
            switch (s2) {
                case "I":
                    valArr[j] = i;
                    break;
                case "V":
                    valArr[j] = v;
                    if (j != 0) {
                        if (valArr[j - 1] < valArr[j]) {
                            int val2 = valArr[j] - valArr[j - 1];
                            valArr[j] = val2;
                            valArr[j-1] = 0;
                        }
                    }
                    break;
                case "X":
                    valArr[j] = x;
                    if (j != 0) {
                        if (valArr[j - 1] < valArr[j]) {
                            int val2 = valArr[j] - valArr[j - 1];
                            valArr[j] = val2;
                            valArr[j-1] = 0;
                        }
                    }
                    break;
                case "L":
                    valArr[j] = l;
                    if (j != 0) {
                        if (valArr[j - 1] < valArr[j]) {
                            int val2 = valArr[j] - valArr[j - 1];
                            valArr[j] = val2;
                            valArr[j-1] = 0;
                        }
                    }
                    break;
                case "C":
                    valArr[j] = c;
                    if (j != 0) {
                        if (valArr[j - 1] < valArr[j]) {
                            int val2 = valArr[j] - valArr[j - 1];
                            valArr[j] = val2;
                            valArr[j-1] = 0;
                        }
                    }
                    break;
                case "D":
                    valArr[j] = d;
                    if (j != 0) {
                        if (valArr[j - 1] < valArr[j]) {
                            int val2 = valArr[j] - valArr[j - 1];
                            valArr[j] = val2;
                            valArr[j-1] = 0;
                        }
                    }
                    break;
                case "M":
                    valArr[j] = m;
                    if (j != 0) {
                        if (valArr[j - 1] < valArr[j]) {
                            int val2 = valArr[j] - valArr[j - 1];
                            valArr[j] = val2;
                            valArr[j-1] = 0;
                        }
                    }
                    break;
            }
        }
        return sumArrayElements(valArr);
    }
    public static int sumArrayElements(int[] arr) {
        int sum = 0;

        for (int element : arr) {
            sum += element;
        }

        return sum;
    }
}
