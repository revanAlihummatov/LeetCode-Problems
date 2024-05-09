package XOX;

import java.util.Random;
import java.util.Scanner;

public class InputMain {
    public int inputRandom(int origin, int bound) {
        Random rd = new Random();
        int random = rd.nextInt(origin, bound);
        return random;
    }

    public int inputScanner() {
        Scanner sc = new Scanner(System.in);
        int scan = sc.nextInt();
        return scan;
    }
}
