public class Reverse_optimize {

                      
    public static void reverse(int arr[],int start,int end){
                     while (start<end) {
                            int temp=arr[start];
                            arr[start]=arr[end];
                            arr[end]=temp;

                            start++;
                            end--;
                         
                       } 
                    }
                                        public static void rotate(int arr[],int k){
                                            k=k%arr.length;  // k> arr.length
                                            int n=arr.length;
                                            reverse(arr, n-k, n-1);
                                            reverse(arr, 0, n-k-1);
                                            reverse(arr, 0, n-1);

                                        }

                public static void print(int arr[]){
                    for(int i=0;i<arr.length;i++){
                        System.out.print(" "+arr[i]);
                    }
                }
                       public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr, k);
    print(arr);
    }
}
