package Array;

public class Sub_arr_Sum_Prefix_techniqyes {

                        public static void calculatePPrefix_sum(int arr[]){
                            int curr_sum=0;
                            int max_sum=0;
                            int preffix_sum[]=new int[arr.length];

                            preffix_sum[0]=arr[0];

                            for (int i = 1; i < preffix_sum.length; i++) {
                                preffix_sum[i]=preffix_sum[i-1]+arr[i];
                            }
                    for (int i = 0; i<arr.length; i++) {
                        int start=i;
                        for (int j = 0; j <arr.length; j++) {

                            int end=j;
                            curr_sum= start==0? preffix_sum[end]: preffix_sum[end]-preffix_sum[start-1];
                            max_sum=Math.max(curr_sum, max_sum);

                        }
                    }
                    System.out.println(max_sum);
                        }


                                      
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        calculatePPrefix_sum(arr);
    }
}
