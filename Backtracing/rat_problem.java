public class rat_problem {

    public static  int calculate_ratstep(int n ,int m , int i,int j,boolean visited[][]){
      if (i < 0 || j < 0 || i==n|| j==n|| visited[i][j] ) {
         return 0;
     }
     
     // Base case: If destination is reached
     if (i == n - 1 && j == m - 1) {
         return 1;
     }
             visited[i][j]=true;
             int up=calculate_ratstep(n, m, i, j-1,visited);
             int down=calculate_ratstep(n, m, i, j+1,visited);
             int left=calculate_ratstep(n, m, i-1, j,visited);
             int right=calculate_ratstep(n, m, i+1, j,visited);

             visited[i][j]=false;    // backtrack 
             return up+down+left+right;

    }
   public static void main(String[] args) {
        int n=3, m=3;
        boolean [][]visited=new boolean[n][m];
        System.out.println(calculate_ratstep(n, m, 0, 0, visited));
   } 
}
