
 // using the divide and conquer methods
public class Search_sroted {

    public static int Search_sorted_divideconq(int arr[],int target){
        int low = 0;
        int heigh=arr.length-1;
        while (low<=heigh) {
            int mid=(low+heigh)/2;

            if (arr[mid]==target) {
                break;
            }else if (arr[mid]>target){
                heigh=mid-1;
            }else {
                low=mid+1;
            }
            return mid;
        }
 return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,7};
        int target=2;
        int result=Search_sorted_divideconq(arr, target);
        System.out.println(result);
    }
}
