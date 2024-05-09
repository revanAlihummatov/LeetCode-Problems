package XOX;

public class XOXGetWinner {
    private static boolean checkRow(char[][] board, int row) {
        return board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != ' ';
    }

    private static boolean checkColumn(char[][] board, int col) {
        return board[0][col] == board[1][col] && board[1][col] == board[2][col] && board[0][col] != ' ';
    }

    private static boolean checkDiagonal(char[][] board) {
        return (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ');
    }

    public char getWinner(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (checkRow(board, i)) {
                return board[i][0];
            }
            if (checkColumn(board, i)) {
                return board[0][i];
            }
        }
        if (checkDiagonal(board)) {
            return board[1][1];
        }
        return ' ';
    }
}
