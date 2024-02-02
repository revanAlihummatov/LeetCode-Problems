package array;

public class NumberOfEmployeesWhoMetTheTarget {
    public static void main(String[] args) {
        NumberOfEmployeesWhoMetTheTarget nOEWMTT = new NumberOfEmployeesWhoMetTheTarget();
        int[] hours = {5,1,4,2,2};
        int target = 6;
        System.out.println(nOEWMTT.numberOfEmployeesWhoMetTarget(hours,target));
    }
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int value=0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target){
                value++;
            }
        }
        return value;
    }
}
