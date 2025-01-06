public class Knights_Tour_problem {

    public static boolean issafe(int board[][], int row, int col) {
        int i = row;
        int j = col;

        // up 2 right side
        i = i - 2;
        j = j + 1;
        if (i >= 0 && j < board.length && board[i][j] != -1) {
            return false;
        }

        // up 2 left side
        i = i - 2;
        j = j - 1;
        if (i >= 0 && j >= 0 && board[i][j] != -1) {
            return false;
        }

        // up 1 left
        i = i - 1;
        j = j - 2;
        if (i >= 0 && j >= 0 && board[i][j] != -1) {
            return false;
        }

        // up 1 right
        i = i - 1;
        j = j + 2;
        if (i >= 0 && j < board.length && board[i][j] != -1) {
            return false;
        }

        // down 2 left side
        i = i + 2;
        j = j - 1;
        if (i < board.length && j >= 0 && board[i][j] != -1) {
            return false;
        }

        // down 2 right side
        i = i + 2;
        j = j + 1;
        if (i < board.length && j < board.length && board[i][j] != -1) {
            return false;
        }

        // down 1 left
        i = i + 1;
        j = j - 2;
        if (i < board.length && j >= 0 && board[i][j] != -1) {
            return false;
        }

        // down 1 right
        i = i + 1;
        j = j + 2;
        if (i < board.length && j < board.length && board[i][j] != -1) {
            return false;
        }

        return true;
    }

    public static void check_moves(int board[][], int row, int col) {
        // base case
        if (row == board.length) {
            PrintBoard(board);
            return;
        }

        board[row][col] = 0;

        if (issafe(board, row, col)) {
            check_moves(board, row , col );
            board[row][col] = -1;
        }
    }

    public static void PrintBoard(int board[][]) {
        System.out.println("___________________");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("___________________");
    }

    public static void main(String[] args) {
        int n = 8;
        int board[][] = new int[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = -1;
            }
        }
        check_moves(board, 0, 0);
    }
}