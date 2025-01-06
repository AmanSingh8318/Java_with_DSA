package Array;

public class Sub_Array {
                    
                        public static void sub_arr(int arr[]){
                        for(int i=0;i<arr.length;i++){
                            int start=arr[i];
                            for(int j=0;j<arr.length;j++){
                                int end=arr[j];

                                for(int k=start;k<=end;k++){
                                    System.out.print(k);
                                }

                                System.out.println();
                            }
                        }
                        }

public static void Add_sub_Arr(int arr[]){
    int max_sum=0;
    for (int i = 0; i <= arr.length; i++) {
        
        int curr_sum=0;
        for (int j = 0; j <arr.length; j++) {
            curr_sum+=arr[j];
            max_sum=Math.max(curr_sum, max_sum);
        }
    }
    System.out.println("The maxmimum sub array is "+max_sum);
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        sub_arr(arr);
        Add_sub_Arr(arr);
    }
}