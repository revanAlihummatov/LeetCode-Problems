package array;

import java.util.ArrayList;
import java.util.List;

public class DeleteGreatestValueinEachRow {
    public static void main(String[] args) {
        System.out.println(deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}}));
    }

    public static int deleteGreatestValue(int[][] grid) {
        int answer = 0;

        while (grid.length > 0) {
            int maxDeleted = Integer.MIN_VALUE;
            List<int[]> list = new ArrayList<>();

            for (int[] val : grid) {
                int maxVal = Integer.MIN_VALUE;
                int maxIndex = -1;
                for (int i = 0; i < val.length; i++) {
                    if (val[i] > maxVal) {
                        maxVal = val[i];
                        maxIndex = i;
                    }
                }
                maxDeleted = Math.max(maxDeleted, maxVal);
                int[] newRow = new int[val.length - 1];
                int idx = 0;
                for (int i = 0; i < val.length; i++) {
                    if (i != maxIndex) {
                        newRow[idx++] = val[i];
                    }
                }
                if (newRow.length > 0) {
                    list.add(newRow);
                }
            }

            answer += maxDeleted;
            grid = list.toArray(new int[list.size()][]);
        }

        return answer;
    }

}
