public class N_Queen_Problem {

   public static boolean isSafe(char board[][],int row,int col){

            //for vertical straight 
           for (int i = row-1; i>=0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
           }
            //  right side up
           for (int i = row-1,j=col-1; i>=0 && j>=0; i--,j--) {
               if (board[i][j]=='Q') {
                  return false;
               }
           }
    /// left side up
           for (int i = row-1,j=col+1; i>=0 && j<board.length; i--,j++) {
            if (board[i][j]=='Q') {
               return false;
            }
        }
            return true;
   }

                public static void setN_Queen(char board[][],int row){

                        // base case 
                        if (row==board.length) {
                            PrintArr(board);
                            count++;
                            return;
                        }

                    for (int j= 0; j < board.length; j++) {
                        if (isSafe(board, row, j)) {
                            board[row][j]='Q';
                        setN_Queen(board, row+1);  
                        board[row][j]='X';   // backtracking step
                        }
                    }
                }

                public static void PrintArr(char board[][]){

                    System.out.println("______________________");
                    for (int i = 0; i < board.length; i++) {
                        for (int j = 0; j < board.length; j++) {
                            System.out.print(board[i][j]+ "     ");
                        }
                        System.out.println();
                    }
                    System.out.println("_______________________");
                }
            
                static int count=0;
     public static void main(String[] args) {
        int n=5;
        char board[][]=new char[n][n];
        //initiliazed 

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='X';
            }
        }
        setN_Queen(board, 0);


        System.out.println(count);
        // PrintArr(board);
    }
}
