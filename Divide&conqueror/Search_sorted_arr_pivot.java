public class Search_sorted_arr_pivot {


    public static int search_Sorted(int arr[],int target){

        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                ans= i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1,};
        int target = 8;
        int ans = search_Sorted(arr, target);
        System.out.println("The target element indx is found at the postion of  "+ans);
    }
}
