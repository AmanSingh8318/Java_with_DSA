public class New_Quicksort {

    public static void PrintArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void QuickSort(int arr[],int start,int end){
        if (start>end) {
            return ;
        }
        int pi=Partition(arr, start, end); // call and store
        QuickSort(arr, start,pi-1); // left side 
        QuickSort(arr, pi+1, end); // right side
    }

    // sort the array 
      public  static int Partition(int arr[],int start,int end){
            // make pivot last element of the array 
            int pivot=arr[end];
             int i=start-1;
             for (int j = start; j < arr.length; j++) {
                if (arr[j]<pivot) {
                    i++; // place the element at i 
                     int temp=arr[j];
                     arr[j]=arr[i];
                     arr[i]=temp;
                }
             }
             int temp=arr[i+1];
             arr[i+1]=arr[end];
             arr[end]=temp;
             return i+1;
      }
      
    public static void main(String[] args) {
        int arr[]={9,4,2,5,8};
        QuickSort(arr, 0, arr.length-1);
        PrintArr(arr);
    }
}
