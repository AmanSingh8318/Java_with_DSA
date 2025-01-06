public class BinarySearch {


    // Function to perform binary search
    public static void  SearchBinary( int arr[],int key){

         int low=0;
         int high=arr.length-1;
        
         while (low<high) {
            int mid=(low+high)/2;

            if (arr[mid]==key) {
                  System.out.println("No is found "+key+"\t at the position of "+mid);
                  return;
            }
                else if (arr[mid]>key){
                        high=mid-1;
                }
                else {
                    low=mid+1; 
                }
                        // mid=(low+high)/2;


         }
         System.out.println("no is not found in array");
    }
    public static void main(String[] args) {
         int arr[]={1,2,3,4,5,6};
         SearchBinary(arr,5);

    }
}
