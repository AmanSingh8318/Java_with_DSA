public class MinVal {

    public static void Minval(int arr[],int min){

        min=arr[0];
       for (int i = 1; i < arr.length; i++) {
           if (arr[i]<min) {
            min=arr[i];
           }
       }
       System.out.println("min val is"+min);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
Minval(arr, 0);
    }
}
