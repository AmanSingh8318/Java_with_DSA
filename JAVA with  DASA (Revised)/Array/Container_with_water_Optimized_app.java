package Array;

public class Container_with_water_Optimized_app {
       
                         public static void Most_Water(int arr[]){
                              int start=0;
                              int end=arr.length-1;
                              int max_water=0;
                              int width=0;
                              int height=0;
                              int total=0;
                               // tow pointer approach 

                               while (start<=end) {
                                height=Math.min(arr[start], arr[end]);

                                 width=end-start;

                                 total=height*width;
                                 max_water=Math.max(total, max_water);
                                    if (arr[start]<arr[end]) {
                                        start++;
                                    }else{
                                        end--;

                                    }
                               }

                               System.out.println(max_water);
                         }
   
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        Most_Water(arr);
    }
}
