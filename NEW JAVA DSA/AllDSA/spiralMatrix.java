/**
 * spiralMatrix
 */
public class spiralMatrix {
   public static void SpiralM(int arr[][]){
      int start_row=0;
      int end_row=arr.length-1;
      
      int start_col=0;
      int end_col=arr[0].length-1;

      while (start_row>=end_row && start_col>=end_col) {
            // Top boundary 
            // here goes from starting column to end column  
        for (int j =start_col; j <=end_col; j++) {
            System.out.print(arr[start_row][j] +" ");
        }
        // rgiht boundary
            // here goes from staring column to end row
       for (int i =start_col+1; i <=end_row; i++) {
          System.out.print(arr[i][end_col]);
       }
    //     bottom bondary
    // here goes from end column to the start column 
       for (int j = end_col+1; j >=start_col; j--) {
        System.out.print(arr[end_row][j]);
       }

       // left boundary 
       //here goes from end row to start row
       for (int i = end_row-1; i >=start_row+1; i--) {
        System.out.print(arr[i][start_col]);
       }
        start_row++;
        end_row--;
        start_col++;
        end_col--;
      }
   }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}};
        SpiralM(arr);
    }
}