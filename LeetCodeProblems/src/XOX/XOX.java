package XOX;

public class XOX {
    public static void main(String[] args) {
        InputMain inputMain = new InputMain();
        XOXGetWinner getWinner = new XOXGetWinner();
        int starting = 0;
        char[][] arr = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        System.out.println("Let's choose who will start");
        System.out.println("1 or 2 which you choose");
        int in = inputMain.inputScanner();
        int rdin = inputMain.inputRandom(1, 3);
        if (in == rdin) {
            System.out.println("You will start first");
        } else {
            starting = -1;
            System.out.println("the first computer will start");
        }
        while (true) {
            if (isGameOver(arr)) {
                break;
            } else {
                if (starting == 0) {
                    System.out.println("İt's your turn");
                    int row = inputMain.inputScanner();
                    int line = inputMain.inputScanner();
                    if (arr[row][line] != ' ') {
                        System.out.println("It is false input!");
                        row = inputMain.inputScanner();
                        line = inputMain.inputScanner();
                    } else {
                        arr[row][line] = 'X';
                    }
                    starting = -1;
                } else {
                    System.out.println("İt's computer turn");
                    int rowComp = inputMain.inputRandom(0, 3);
                    int lineComp = inputMain.inputRandom(0, 3);
                    if (arr[rowComp][lineComp] != ' ') {
                        rowComp = inputMain.inputRandom(0,3);
                        lineComp = inputMain.inputRandom(0, 3);
                    } else {
                        System.out.println("Computer choose:\n" + rowComp + "\n" + lineComp);
                        arr[rowComp][lineComp] = 'O';
                    }
                    starting = 0;
                }
                System.out.println("The table is :");
                printCharArray(arr);
            }
        }
        char winner = getWinner.getWinner(arr);
        if (winner == 'X') {
            System.out.println("You Win!");
            System.out.println("The table is :");
            printCharArray(arr);
        } else if (winner == 'O') {
            System.out.println("Computer is win!");
            System.out.println("The table is :");
            printCharArray(arr);
        } else {
            System.out.println("Tie try again");
            System.out.println("The table is :");
            printCharArray(arr);
        }


    }

    public static void printCharArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isGameOver(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ') {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                    return true;
                }
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != ' ') {
                if (board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                    return true;
                }
            }
        }
        if (board[0][0] != ' ' && board[0][2] != ' ')
            if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] ||
                    (board[0][2] == board[1][1] && board[1][1] == board[2][0]))) {
                return true;
            }
        boolean tie = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    tie = false;
                    break;
                }
            }
        }
        if (tie) {
            return true;
        }
        return false;
    }

}
