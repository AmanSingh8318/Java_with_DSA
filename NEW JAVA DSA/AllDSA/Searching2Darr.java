/**
 * Searching2Darr
 */
public class Searching2Darr {
    public static void search(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        int target=20;
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col; j++) {
                if (arr[i][j]==target) {
                    System.out.println("no is found "+target+"at the position of "+i+j);
                }
            }
        }
    }

                    public static void main(String[] args) {
                        int arr[][]={{10,20,30,40}};
                            search(arr);
                    }

                }