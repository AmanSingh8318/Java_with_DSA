public class transposeOfMatrix {
    public static void transpose(int arr[][]){
        int row = 2;
        int col = 3;
        int transposeMat[][] = new int[col][row]; // Swap row and col here
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposeMat[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < col; i++) { // Loop through transposeMat's rows
            for (int j = 0; j < row; j++) { // Loop through transposeMat's cols
                System.out.print(transposeMat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}};
        transpose(arr);
    }
}