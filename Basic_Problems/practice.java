/**
 * practice
 */
public class practice {

    public static int[] concat(int arr[]){
   int res= new int [arr.length];
        res.concat=arr;
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        concat(arr);
    }
}