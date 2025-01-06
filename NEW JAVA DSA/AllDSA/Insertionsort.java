/**
 * Insertionsort
 */
public class Insertionsort {
  public static void sorts(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        int min=i;
        for (int j = i+1; j < arr.length-1; j++) {
            
            if (arr[j]<arr[min]) {
                  min=j;                
            }
            if (i!=min) {
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }
  }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        sorts(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}