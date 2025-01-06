public class Is_arr_Sorted {


     public static boolean Check_sorted(int arr[],int i ){
            if (i== arr.length-1) {
                 return true;
            }
            if (arr[i]>arr[i+1]) {
                  return false;
            } 
            return  Check_sorted(arr, i + 1);
     }
    public static void main(String[] args) {
          int arr[]={1,2,3,4 ,5};
          int i=0;
         boolean isSorted=Check_sorted(arr, i);
          System.out.println(isSorted);
    }

}
