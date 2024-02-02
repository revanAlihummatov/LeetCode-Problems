package hashTable;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int val = 0;
        char[] arr = new char[jewels.length()];
        for (int i = 0; i < jewels.length(); i++) {
            arr[i] = jewels.charAt(i);
        }
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (stones.charAt(i) == arr[j])val++;
            }

        }
        return val;
    }
}
