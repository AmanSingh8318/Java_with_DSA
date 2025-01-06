package Array;

public class Liner_Search {
  
                    public static void Linnear_arr(int arr[],int key){
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i]==key) {
                                System.out.println("Element is present at index "+i);
                                break;
                            }
                        }
                         
                    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,8};
        int key=5;
        Linnear_arr(arr, key);
        
    }
}