public class starArrSeach {

    public static void stairSearch(int arr[][], int key) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Key is found at the position (" + row + ", " + col + ")");
                return;
            } else if (arr[row][col] > key) {
                col--;
            } else { 

                row++;
            }
        }
        System.out.println("Key is not found");
    }

    public static void secApproach_stair(int arr[][],int key){
        int col=0;
        int row=arr.length-1;
        while (col<arr.length && row>=0) {
            if (arr[row][col]==key) {
                System.out.println("Key is found at the position (" + row + ", " + col + ")");
                return;
            }
            else if(arr[row][col]>key){
                    row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key is not found");
    }

    public static void main(String[] args) {
        int arr[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 20;
        // stairSearch(arr, key);
        secApproach_stair(arr, key);
    }
}
