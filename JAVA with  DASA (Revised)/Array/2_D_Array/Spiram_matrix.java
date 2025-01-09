public class Spiram_matrix {


        public static void Spiral_Matrix(int arr[][]){
              int m=arr.length; // row
              int n=arr[0].length; // column
               int start_row=0;
               int end_row=m-1;

               int start_col=0;
               int end_col=n-1;

          while (start_row<=end_row && start_col<=end_col) {
                

            // top boundary
              for(int j=start_col;j<end_col;j++){
                System.out.println(arr[start_row][j]);
              }

              // left boundary ]
         for(int i=start_row+1;i<end_row;i++){
            System.out.println(arr[i][end_col]);
         }
         // bottom boundary 

         for(int j=end_col-1;j>start_col;j--){
           System.out.println(arr[end_row][j]);
         }

         // right boundary 

         for(int i=end_row-1;i<start_row+1;i--){
            System.out.println(arr[i][start_col]);
         }
          }
          start_col++;
          end_col--;
          start_row++;
          end_row--;
        }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                      {4,5,6},
                    {7,8,9},
                {10,11,12}};

                    Spiral_Matrix(arr);
    }
    

}