/**
 * BackTrack_Arr
 */

 // in this code first we create an empty array assign value using the recursion after that subtract
 //-2 from each element using the backtracking 
public class BackTrack_Arr {

    public static void backTrack(int arr[],int i,int val){
        // base case 
            if (i==arr.length) {
                PrintArr(arr);
                return;
            }
            // assign value
            arr[i]=val;
        // recursion call
        backTrack(arr, i+1, val+1);

        // backtracking 
        arr[i]=arr[i]-2;
    }

       public static void PrintArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]);   
        }
        System.out.println();
       }

    public static void main(String[] args) {
        int arr[]=new int[5];
        backTrack(arr, 0, 1);
        PrintArr(arr);

    }
}