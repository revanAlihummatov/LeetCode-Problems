package leetcodeMeseleler;

public class FInalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        FInalValueOfVariableAfterPerformingOperations fVOVAPO = new FInalValueOfVariableAfterPerformingOperations();
        String[] operations = {"--X","X++","X++"};
        System.out.println(fVOVAPO.finalValueAfterOperations(operations));
    }
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("X++") || operations[i].equals("++X")){
                x++;
            }
            if (operations[i].equals("X--") || operations[i].equals("--X")){
                x--;
            }
        }
        return x;
    }
}
