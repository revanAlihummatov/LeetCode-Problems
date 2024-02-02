package array;

import java.util.ArrayList;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
        CountPairsWhoseSumIsLessThanTarget cPWSILTT = new CountPairsWhoseSumIsLessThanTarget();
        List<Integer> nums = new ArrayList<>();
        nums.add(0, -6);
        nums.add(1, 2);
        nums.add(2, 5);
        nums.add(3, -2);
        nums.add(4, -7);
        nums.add(5, -1);
        nums.add(6, 3);
        int target = -2;
        System.out.println(cPWSILTT.countPairs(nums, target));
    }

    public int countPairs(List<Integer> nums, int target) {
        int val = 0;
        for (int i = 0; i < nums.size()-1; i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (j != i) {
                    int numssum = nums.get(i) + nums.get(j);
                    if (numssum < target) {
                        val++;
                    }
                }


            }
        }
        return val;



    }
}
