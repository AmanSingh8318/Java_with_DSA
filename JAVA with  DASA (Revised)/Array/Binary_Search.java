package Array;

public class Binary_Search {

                        public static void Binary_array_search(int arr[],int key){

                            int n=arr.length;
                            int low=0;
                            int high=n-1;

                           while (low<=high) {
                            
                           
                                int mid=(low+high)/2;

                                if (arr[mid]==key) {
                                    System.out.println("Element is found at the position of "+mid);
                                    break;
                                } else if(arr[mid]>key)
                                {
                                    high=mid-1;
                                }else if (arr[mid]<key) {
                                    low=mid+1;
                                }  
                                else {
                                    System.out.println("Element is not found");
                                }
                           }
                           
                        }   
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6};
        int key=6;
        Binary_array_search(arr,key);

    }
}
