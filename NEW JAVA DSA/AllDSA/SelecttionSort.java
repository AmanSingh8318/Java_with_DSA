/**
 * SelecttionSort
 */
public class SelecttionSort {
     public static void Section(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minVal=i;
            for (int j = i+1; j < arr.length; j++) {
                 if (arr[minVal]>arr[j]) {
                    minVal=j;
                    
                 }
            }
              int temp=arr[minVal];
              arr[minVal]=arr[i];
                arr[i]=temp;
        }
     }
    public static void main(String[] args) {
        int arr[]={64,25,12,22,11};
        Section(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}