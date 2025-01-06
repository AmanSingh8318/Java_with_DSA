/**
 * Gri_Problem
 */
public class Gri_Problem {
  
       public static  int count_gridWay(int i,int j,int n ,int m){
                  
        if (i==n-1 && j==m-1) {
            return 1;
        }
        else if(i==n || j==n){
            return 0;
        }
        int w1=count_gridWay(i+1, j, n, m);
        int w2=count_gridWay(i, j+1, n, m);

        return w1+w2;
       }
    public static void main(String[] args) {
        int n=4,m=4;
        System.out.println(count_gridWay(0, 0, n, m));
    }
    
}