public class Sudoko {

          public static boolean isSafe(int Sudokos[][],int row, int col,int digit){
              // row
              for (int i = 0; i <9; i++) {
                  if (Sudokos[i][col]==digit) {
                    return  false;
                  }
              }
                    //for col 
               for (int j = 0; j <9; j++) {
                if (Sudokos[row][j]==digit) {
                    return false ;
                }
               }

               // now for grid
               // so first need to find the starting and ending of the grid bcoz of 3*3 grid in 9*9
            int start_row=(row/3) * 3;
            int start_col=(col/3) * 3;

            for (int i = start_row; i <start_row+3; i++) {
                for (int j = start_col; j <start_col+3; j++) {
                    if (Sudokos[i][j]==digit) {
                        return false;
                    }   
                }
            }

            return true;
          }
      public static boolean check_soul_sudoko(int Sudokos[][],int row ,int col){
            
  //base case    
      if (row==9 ) {
        return true;
      }

            
             // recursion 
               int Nextrow=row;
               int Nextcol=col+1;

               if (Nextcol==9) {
                Nextrow=row+1;
                Nextcol=0;
               }
                    if (Sudokos[row][col]!=0) {
                        return check_soul_sudoko(Sudokos, Nextrow, Nextcol);
                    }

             for(int digit=1; digit<=9;digit++){
                  if (isSafe(Sudokos,row,col,digit)) {
                      Sudokos[row][col]=digit;
                    if(check_soul_sudoko(Sudokos, Nextrow, Nextcol)){ // check if solution exist return true 
                      return true;
                  }
                  Sudokos[row][col]=0;
             }
            }
              return false;
      } 
    
                                public static void printSuodko(int Sudokos[][]){
                            System.out.println("__________________________");
                            for (int i = 0; i <9; i++) {
                                for (int j = 0; j <9; j++) {
                                    System.out.print(Sudokos[i][j]+"  ");
                                }
                                System.out.println();
                            } 
                                System.out.println("____________________________");
                        }

    public static void main(String[] args) {
         int Sudokos[][]=
        {{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};
        if (check_soul_sudoko(Sudokos, 0, 0)) {
              System.out.println("soloution exist");
              printSuodko(Sudokos);
        }else {
            System.out.println("solution does not exist");
        }
    }
    
}
