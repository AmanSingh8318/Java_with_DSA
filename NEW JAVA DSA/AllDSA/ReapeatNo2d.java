/**
 * ReapeatNo2d
 */
public class ReapeatNo2d {
            public static int Search(int arr[][]){
                int row = arr.length;
                    int col=arr[0].length-1;
                    int repeat=7;
                    int ans=0;
                    for (int i = 0; i <row; i++) {
                        for (int j = 0; j <col; j++) {
                            if (arr[i][j]==repeat) {
                               ans++; 
                            }
                        }
                    }
                return ans;
            }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5,7,7,8,9}};

            System.out.println("The number 7 that is repeated by "+Search(arr)+"times");
    }
}