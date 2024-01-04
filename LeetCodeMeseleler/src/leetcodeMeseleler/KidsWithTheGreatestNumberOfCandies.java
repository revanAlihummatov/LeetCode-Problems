package leetcodeMeseleler;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        KidsWithTheGreatestNumberOfCandies kWTGNOC = new KidsWithTheGreatestNumberOfCandies();
        int[] candies = {12,1,12};
        int extraCandies = 10;
        for (boolean value : kWTGNOC.kidsWithCandies(candies, extraCandies)) {
            System.out.println(value);
        }
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> b = new ArrayList<>();
        int[] candies2 = new int[candies.length];
        for (int i = 0; i < candies.length; i++) {
            int val = 0;
            candies2[i] = candies[i] + extraCandies;
            for (int j = 0; j < candies.length; j++) {
                if (candies2[i] >= candies[j]) {
                    val++;
                }
            }
            if (val == candies.length) b.add(true);
            if (val != candies.length)b.add(false);
        }
        return b;
    }
}
