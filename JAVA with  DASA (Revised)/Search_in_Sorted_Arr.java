public class Search_in_Sorted_Arr {

                    public static void reverse_Arr(int arr[],int start,int end){

                         while (start<end) {
                            int temp=arr[start];
                            arr[start]=arr[end];
                            arr[end]=temp;

                            start++;
                            end--;
                         }
                    }

    public static void rotate(int arr[],int k){
        int n=arr.length;
        k=k%arr.length;
        reverse_Arr(arr, n-k, n-1);
        reverse_Arr(arr, 0, n-k-1);
        reverse_Arr(arr, 0, n-1);
        search(arr, 1);
    }
              public static void search(int arr[],int target){
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i]==target) {
                        System.out.println(i);
                    }
                }
              }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=3;
        rotate(arr, k);
    }
}
