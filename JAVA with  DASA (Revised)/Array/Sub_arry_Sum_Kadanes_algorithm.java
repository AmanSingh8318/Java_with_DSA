package Array;

public class Sub_arry_Sum_Kadanes_algorithm {

                        public static void sub_array_Sum(int arr[]){
                           int curr_sum=0;
                           int max_sum=0;
                           max_sum=arr[0];  // for edge case like input [-1]
                           curr_sum=arr[0];
                            for (int i = 1; i < arr.length; i++) {
                                 
                                // curr_sum+=arr[i];  
                                // instead of this curr_sum+=arr[i];
                                curr_sum=Math.max(arr[i], curr_sum+arr[i]);
                                max_sum=Math.max(curr_sum, max_sum);

                                if (curr_sum<0) {
                                    curr_sum=0;
                                }
                            }

                            System.out.println(max_sum);
                            }

                        
    public static void main(String[] args) {
        // int arr[]={1,-2,3,4};\
        int arr[]={-1};
        sub_array_Sum(arr);
    }
}
